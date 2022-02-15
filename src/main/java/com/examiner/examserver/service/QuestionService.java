package com.examiner.examserver.service;

import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.exam;

import java.util.Set;

public interface QuestionService {

    public Question addQuestion(Question question);

    public Question updateQuestion(Question question);

    public Set<Question> getQuestions();

    public Question getQuestion(Long questionId);

    public void deleteQuestion(Long questionId);
}
