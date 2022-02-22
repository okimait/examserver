package com.examiner.examserver.controller;

import com.examiner.examserver.model.program.program;
import com.examiner.examserver.model.program.programCategory;
import com.examiner.examserver.service.programService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/program")
public class programController {
    @Autowired
    private programService thisProgramService;

//    add a new program
    @PostMapping("/")
    @CrossOrigin("*")
    @JsonIgnore
    public ResponseEntity<program>add(@RequestBody program program){
        return ResponseEntity.ok(thisProgramService.addProgram(program));
    }
//    update a program
    @PutMapping("/program")
    @JsonIgnore
    public ResponseEntity<program> update(@RequestBody program program)
    {
        return ResponseEntity.ok(this.thisProgramService.updateProgram(program));
    }
    /*get all programs*/
    @CrossOrigin("*")
    @GetMapping("/")
    @JsonIgnore
    public ResponseEntity<?> allPrgorams()
    {
        return ResponseEntity.ok(this.thisProgramService.getPrograms());
    }
    /*get single program by id*/
    @GetMapping("/{programId}")
    public program program(@PathVariable("programId") Long programId)
    {
        return this.thisProgramService.getProgram(programId);
    }
    /*delete a program by id*/
    @CrossOrigin("*")
    @DeleteMapping("/{programId}")
    @JsonIgnore
    public void delete (@PathVariable("programId") Long programId)
    {
        this.thisProgramService.deleteProgram(programId);
    }
    /*get program by programcategory*/

    @GetMapping("/programCategory/{programCategoryId}")
    @JsonIgnore
    public List<program> getExamsOfCategory(@PathVariable("programCategoryId") Long programCategoryId){
        programCategory programCategory = new programCategory();
        programCategory.setProgramCategoryId(programCategoryId);
        return this.thisProgramService.getProgramsOfCategory( programCategory);

    }


}
