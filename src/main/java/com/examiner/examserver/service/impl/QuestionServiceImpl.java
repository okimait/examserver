package com.examiner.examserver.service.impl;

import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.exam.subModule;
import com.examiner.examserver.repo.QuestionRepository;
import com.examiner.examserver.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question addQuestion(Question question) {
        return this.questionRepository.save(question);
    }
    @Override
    public Question updateQuestion(Question question) {
        return this.questionRepository.save(question);
    }
    @Override
    public Set<Question> getQuestions() {
        return new LinkedHashSet<>(this.questionRepository.findAll());
    }
    @Override
    public Set<Question> getQuestionsOfSubmodule(subModule subModule) {
        return this.questionRepository.findBySubModule(subModule);
    }
    @Override
    public Question getQuestion(Long questionId) {
        return this.questionRepository.findById(questionId).get();
    }
    @Override
    public void deleteQuestion(Long questionId) {
        Question question = new Question();
        question.setQuestionId(questionId);
        this.questionRepository.delete(question);


    }
}
