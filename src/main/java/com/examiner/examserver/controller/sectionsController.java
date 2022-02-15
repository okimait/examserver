package com.examiner.examserver.controller;

import com.examiner.examserver.model.program.programCategory;
import com.examiner.examserver.model.questionSection.sections;
import com.examiner.examserver.service.programCategoryService;
import com.examiner.examserver.service.sectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sections")
@CrossOrigin("*")
public class sectionsController {
    @Autowired
    private sectionsService sectionsService;

    /*add a section*/
    @PostMapping("/sections")
    public ResponseEntity<sections> addSection(@RequestBody sections sections){
        sections sections1 = this.sectionsService.addSection(sections);
        return ResponseEntity.ok(sections1);
    }

    /*get a section*/
    @GetMapping("/{sectionId}")
    public sections sections(@PathVariable("sectionId") Long sectionId)
    {
        return this.sectionsService.getQuestionSection(sectionId);
    }

    /*get all sections*/
    @GetMapping("/")
    public ResponseEntity<?> getSections()
    {
        return ResponseEntity.ok(this.sectionsService.getQuestionSection());
    }

    /*update a section*/
    @PutMapping("/")
    public sections sections(@RequestBody sections sections)
    {
        return this.sectionsService.updateSection(sections);
    }

    /*delete section*/
    @DeleteMapping("/{sectionId}")
    public void deleteSetion(@PathVariable("sectionId") Long sectionId)
    {
        this.sectionsService.deleteSection(sectionId);
    }
}
