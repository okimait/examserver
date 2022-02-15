package com.examiner.examserver.service;

import com.examiner.examserver.model.program.programCategory;
import java.util.Set;
public interface programCategoryService {
    public programCategory addProgramCategory(programCategory programCategory);

    public programCategory updateProgramCategory(programCategory programCategory);

    public Set<programCategory> getProgramCategories();

    public programCategory getProgramCategory(Long programCategoryId);

    public void deleteProgramCategory(Long programCategoryId);
}
