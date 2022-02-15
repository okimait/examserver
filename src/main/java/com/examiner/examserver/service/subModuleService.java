package com.examiner.examserver.service;

import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.exam.subModule;

import java.util.Set;

public interface subModuleService {
    public subModule addSubModule(subModule subModule);

    public subModule updateSubModule(subModule subModule);

    public Set<subModule> getSubModules();

    public subModule getSubModule(Long subModuleId);

    public void deleteSubModule(Long subModuleId);
}
