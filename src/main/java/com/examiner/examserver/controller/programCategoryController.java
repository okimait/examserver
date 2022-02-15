package com.examiner.examserver.controller;
import com.examiner.examserver.model.program.programCategory;
import com.examiner.examserver.service.programCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/program-category")
@CrossOrigin("*")
public class programCategoryController {
    @Autowired
    private programCategoryService programCategoryService;

    /*add a category*/
    @PostMapping("/")
    public ResponseEntity<programCategory> addProgramCategory(@RequestBody programCategory programCategory){
        programCategory programCategory1 = this.programCategoryService.addProgramCategory(programCategory);
        return ResponseEntity.ok(programCategory1);
    }

    /*get category*/
    @GetMapping("/{programCategoryId}")
    public programCategory programCategory(@PathVariable("programCategoryId") Long programCategoryId)
    {
        return this.programCategoryService.getProgramCategory(programCategoryId);
    }

    /*get all categories*/
    @GetMapping("/")
    public ResponseEntity<?> getProgramCategories()
    {
        return ResponseEntity.ok(this.programCategoryService.getProgramCategories());
    }

    /*update category*/
    @PutMapping("/")
    public programCategory programCategory(@RequestBody programCategory programCategory)
    {
        return this.programCategoryService.updateProgramCategory(programCategory);
    }

    /*delete category*/
    @DeleteMapping("/{programCategoryId}")
    public void deleteProgramCategory(@PathVariable("programCategoryId") Long programCategoryId)
    {
        this.programCategoryService.deleteProgramCategory(programCategoryId);
    }
}
