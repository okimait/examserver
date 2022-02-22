package com.examiner.examserver.service;

import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.exam.subModule;

import java.util.Set;

public interface QuestionService {

    public Question addQuestion(Question question);
    /*update a question*/
    public Question updateQuestion(Question question);
    /*get all questions*/
    public Set<Question> getQuestions();
    /*get questions of a submodule*/
    public Set<Question> getQuestionsOfSubmodule(subModule subModule);
    /*get a single question*/
    public Question getQuestion(Long questionId);
    /*delete a question*/
    public void deleteQuestion(Long questionId);
}
