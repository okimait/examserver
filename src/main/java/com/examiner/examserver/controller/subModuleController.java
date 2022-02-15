package com.examiner.examserver.controller;

import com.examiner.examserver.model.exam.exam;
import com.examiner.examserver.model.exam.subModule;
import com.examiner.examserver.service.examService;
import com.examiner.examserver.service.subModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/subModule")
public class subModuleController {

    @Autowired
    private subModuleService subModuleService;

    /*add add sub-module*/

    @PostMapping("/")
    public ResponseEntity<subModule> add(@RequestBody subModule subModule)
    {
        return ResponseEntity.ok(this.subModuleService.addSubModule(subModule));
    }

    /*update/edit submodule*/
    @PutMapping("/")
    public ResponseEntity<subModule> update(@RequestBody subModule subModule)
    {
        return ResponseEntity.ok(this.subModuleService.updateSubModule(subModule));
    }

    /*get all sub-modules*/
    @GetMapping("/")
    public ResponseEntity<?> allSubmodules()
    {
        return ResponseEntity.ok(this.subModuleService.getSubModules());
    }

    /*get single submodule by id*/
    @GetMapping("/{subModuleId}")
    public subModule subModule(@PathVariable("subModuleId") Long subModuleId)
    {
        return this.subModuleService.getSubModule(subModuleId);
    }

    /*delete an submodule by id*/
    @CrossOrigin("*")
    @DeleteMapping("/{subModuleId}")
    public void delete (@PathVariable("subModuleId") Long subModuleId)
    {
        this.subModuleService.deleteSubModule(subModuleId);
    }

}
