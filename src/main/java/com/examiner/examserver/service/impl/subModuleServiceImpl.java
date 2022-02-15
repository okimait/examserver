package com.examiner.examserver.service.impl;

import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.exam.subModule;
import com.examiner.examserver.repo.subModuleRepository;
import com.examiner.examserver.service.subModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class subModuleServiceImpl implements subModuleService {

    @Autowired
    private subModuleRepository subModuleRepository;

    @Override
    public subModule addSubModule(subModule subModule) {
        return this.subModuleRepository.save(subModule);
    }

    @Override
    public subModule updateSubModule(subModule subModule) {
        return this.subModuleRepository.save(subModule);

    }

    @Override
    public Set<subModule> getSubModules() {
        return new HashSet<>(this.subModuleRepository.findAll());
    }

    @Override
    public subModule getSubModule(Long subModuleId) {
        return this.subModuleRepository.findById(subModuleId).get();
    }

    @Override
    public void deleteSubModule(Long subModuleId) {
        this.subModuleRepository.deleteById(subModuleId);

    }
}
