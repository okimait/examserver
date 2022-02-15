package com.examiner.examserver.service.impl;

import com.examiner.examserver.model.program.programCategory;
import com.examiner.examserver.repo.programCategoryRepository;
import com.examiner.examserver.service.programCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class programCategoryServiceImpl implements programCategoryService {

    @Autowired
    private programCategoryRepository programCategoryRepository;

    @Override
    public programCategory addProgramCategory(programCategory programCategory) {
        return (programCategory) this.programCategoryRepository.save(programCategory);
    }

    @Override
    public programCategory updateProgramCategory(programCategory programCategory) {
        return (programCategory) this.programCategoryRepository.save(programCategory);
    }

    @Override
    public Set<programCategory> getProgramCategories() {
        return new LinkedHashSet<>(this.programCategoryRepository.findAll());
    }

    @Override
    public programCategory getProgramCategory(Long programCategoryId) {
        return (programCategory) this.programCategoryRepository.findById(programCategoryId).get();
    }

    @Override
    public void deleteProgramCategory(Long programCategoryId) {
        programCategory programCategory = new programCategory();
        programCategory.setProgramCategoryId(programCategoryId);
        this.programCategoryRepository.delete(programCategory);

    }
}
