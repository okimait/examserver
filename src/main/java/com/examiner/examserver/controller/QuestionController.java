package com.examiner.examserver.controller;

import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.SubQuestion;
import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.exam.subModule;
import com.examiner.examserver.model.questionSection.sections;
import com.examiner.examserver.service.QuestionService;
import com.examiner.examserver.service.examService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @Autowired
    private examService thisExamService;

    /*add a question*/
    @PostMapping("/")
    @CrossOrigin("*")
    public ResponseEntity<Question> add(@RequestBody Question question) {
        return ResponseEntity.ok(this.questionService.addQuestion(question));
    }

    /*update/edit a question*/
    @PutMapping("/")
    public ResponseEntity<Question> update(@RequestBody Question question) {
        return ResponseEntity.ok(this.questionService.updateQuestion(question));
    }

    /*get all questions of any Exam using examId*/
//    @GetMapping("/exam/{examId}")
//    public ResponseEntity<?> getQuestionsOfanExam(@PathVariable("examId") Long examId) {
//
//        exam thisExam = thisExamService.getExam(examId);
//        Set<Question> questions = thisExam.getQuestionSet();
//        List list = new ArrayList(questions);
//        if (list.size() > Integer.parseInt(thisExam.getNumberOfQuestions())) {
//            list = list.subList(0, Integer.parseInt(thisExam.getNumberOfQuestions() + 1));
//        }
//        Collections.shuffle(list);
//        return ResponseEntity.ok(list);
//
//    }

    /*get single question*/
    @GetMapping("/{questionId}")
    public Question get(@PathVariable("questionId") Long questionId) {
        return this.questionService.getQuestion(questionId);
    }

    /*delete question by id*/
    @DeleteMapping("/{questionId}")
    public void delete(@PathVariable("questionId") Long questionId) {
        this.questionService.deleteQuestion(questionId);
    }



}
