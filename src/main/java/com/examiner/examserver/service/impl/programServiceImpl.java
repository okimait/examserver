package com.examiner.examserver.service.impl;

import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.program.program;
import com.examiner.examserver.model.program.programCategory;
import com.examiner.examserver.repo.programRepository;
import com.examiner.examserver.service.programService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class programServiceImpl implements programService {
    @Autowired
    private programRepository programRepository;

    @Override
    public program addProgram(program program) {
        return this.programRepository.save(program);
    }

    @Override
    public program updateProgram(program program) {
        return this.programRepository.save(program);
    }

    @Override
    public Set<program> getPrograms() {
        return new HashSet<program>(this.programRepository.findAll());
    }

    @Override
    public program getProgram(Long programId) {
        return this.programRepository.findById(programId).get();
    }

    @Override
    public void deleteProgram(Long programId) {
        this.programRepository.deleteById(programId);

    }

    @Override
    public List<program> getProgramsOfCategory(programCategory programCategory) {
        return this.programRepository.findByProgramCategory(programCategory);
    }

}
