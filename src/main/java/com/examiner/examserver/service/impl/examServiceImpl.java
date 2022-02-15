package com.examiner.examserver.service.impl;

import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.repo.examRepository;
import com.examiner.examserver.service.examService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class examServiceImpl implements examService {
    @Autowired
    private examRepository examRepository;
    @Override
    public exam addExam(exam exam) {
        return this.examRepository.save(exam);
    }

    @Override
    public exam updateExam(exam exam) {
        return this.examRepository.save(exam);
    }

    @Override
    public Set<exam> getExams() {
        return new HashSet<>(this.examRepository.findAll());
    }

    @Override
    public exam getExam(Long examId) {
        return this.examRepository.findById(examId).get();
    }

    @Override
    public void deleteExam(Long examId) {
        this.examRepository.deleteById(examId);

    }


    }



