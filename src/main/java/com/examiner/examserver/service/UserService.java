package com.examiner.examserver.service;

import com.examiner.examserver.model.User;
import com.examiner.examserver.model.UserRole;

import java.util.Set;

public interface UserService {

    /*creating user*/
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    /*get user*/
    public User getUser(String username);

    /*delete user by id*/
    public void deleteUser(Long userId);
}
