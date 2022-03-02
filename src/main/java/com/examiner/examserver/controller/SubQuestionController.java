package com.examiner.examserver.controller;

import com.examiner.examserver.model.exam.Question;
import com.examiner.examserver.model.exam.SubQuestion;
import com.examiner.examserver.model.program.program;
import com.examiner.examserver.model.program.programCategory;
import com.examiner.examserver.service.QuestionService;
import com.examiner.examserver.service.SubQuestionService;
import com.examiner.examserver.service.programService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sub-question")
@CrossOrigin("*")
public class SubQuestionController {

  @Autowired
  private SubQuestionService subQuestionService;

  @Autowired
  private QuestionService questionService;

  //    add a new subquestion
  @PostMapping("/")
  @CrossOrigin("*")
  @JsonIgnore
  public ResponseEntity<SubQuestion> add(@RequestBody SubQuestion subQuestion){

    return ResponseEntity.ok(subQuestionService.addSubQuestion(subQuestion));
  }
  //    update a program
  @PutMapping("/")
  @JsonIgnore
  public ResponseEntity<SubQuestion> update(@RequestBody SubQuestion subQuestion)
  {
    return ResponseEntity.ok(this.subQuestionService.updateSubQuestion(subQuestion));
  }
  /*get all subquestions*/
  @CrossOrigin("*")
  @GetMapping("/")
  @JsonIgnore
  public ResponseEntity<?> allSubquestions()
  {
    return ResponseEntity.ok(this.subQuestionService.getSubQuestion());
  }
  /*get single subquestion by id*/
  @GetMapping("/{subQuestionId}")
  public SubQuestion subQuestion(@PathVariable("subQuestionId") Long subQuestionId)
  {
    return this.subQuestionService.getSubQuestion(subQuestionId);
  }
  /*delete a program by id*/
  @CrossOrigin("*")
  @DeleteMapping("/{subQuestionId}")
  @JsonIgnore
  public void delete (@PathVariable("subQuestionId") Long subQuestionId)
  {
    this.subQuestionService.deleteSubQuestion(subQuestionId);
  }
  /*get sub-question by Question*/

//  @GetMapping("/question/{questionId}")
//  @JsonIgnore
//  public List<SubQuestion> getSubQuestionsOfQuestion(@PathVariable("questionId") Long questionId){
//    Question question = new Question();
//    question.setQuestionId(questionId);
//    return this.questionService.( programCategory);
//
//  }

}
