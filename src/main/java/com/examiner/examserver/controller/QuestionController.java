    package com.examiner.examserver.controller;

    import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.SubQuestion;
import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.exam.subModule;
import com.examiner.examserver.model.questionSection.sections;
import com.examiner.examserver.service.QuestionService;
import com.examiner.examserver.service.examService;
import com.examiner.examserver.service.subModuleService;
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
    private subModuleService thisService;

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
    /*Gete all questions of submodule by submoduleId*/
    @GetMapping("/subModule/{subModuleId}")
    @CrossOrigin("*")
    public ResponseEntity<?> getQuestionsOfSubmodule(@PathVariable("subModuleId") Long subModuleId) {
        subModule thisSubmodule = this.thisService.getSubModule(subModuleId);
        Set<Question> questions = thisSubmodule.getQuestions();
        return ResponseEntity.ok(questions);
    }
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
