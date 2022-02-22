package com.examiner.examserver.service;


import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.program.program;
import com.examiner.examserver.model.program.programCategory;

import java.util.List;
import java.util.Set;

public interface programService {
    public program addProgram(program program);

    public program updateProgram(program program);

    public Set<program> getPrograms();

    public program getProgram(Long programId);

    public void deleteProgram(Long programId);

    public List<program> getProgramsOfCategory(programCategory programCategory);





}
