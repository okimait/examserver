package com.examiner.examserver.controller;

import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.service.examService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/exam")
public class examController {

    @Autowired
    private  examService examService;
    /*add exam*/
    @PostMapping("/")
    public ResponseEntity<exam> add(@RequestBody exam exam)
    {
        return ResponseEntity.ok(this.examService.addExam(exam));
    }
    /*update/edit exam*/
    @PutMapping("/")
    public ResponseEntity<exam> update(@RequestBody exam exam)
    {
        return ResponseEntity.ok(this.examService.updateExam(exam));
    }
    /*get all exams*/
    @GetMapping("/")
    public ResponseEntity<?> allExams()
    {
        return ResponseEntity.ok(this.examService.getExams());
    }

    /*get single exam by id*/
    @GetMapping("/{examId}")
    public exam exam(@PathVariable("examId") Long examId)
    {
        return this.examService.getExam(examId);
    }

    /*delete an exam by id*/
    @CrossOrigin("*")
    @DeleteMapping("/{examId}")
    public void delete (@PathVariable("examId") Long examId)
    {
        this.examService.deleteExam(examId);
    }






}
