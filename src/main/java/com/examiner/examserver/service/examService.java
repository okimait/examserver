package com.examiner.examserver.service;

import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.program.program;

import java.util.Set;

public interface examService {
    public exam addExam(exam exam);

    public exam updateExam(exam exam);

    public Set<exam> getExams();

    public exam getExam(Long examId);

    public void deleteExam(Long examId);

    public Set<exam> getModulesOfProgram(program program);



}
