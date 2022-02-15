package com.examiner.examserver.service.impl;

import com.examiner.examserver.helper.UserFoundException;
import com.examiner.examserver.model.User;
import com.examiner.examserver.model.UserRole;
import com.examiner.examserver.repo.RoleRepository;
import com.examiner.examserver.repo.UserRepository;
import com.examiner.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local = this.userRepository.findByUsername(user.getUsername());

        if (local != null) {

            System.out.println("User already exists");
            throw new UserFoundException("User already present");

        } else {

            /*create user*/
            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);

        }
        return local;
    }
    /*getting user by username*/

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    /* delete user by id*/
    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);


    }
}
