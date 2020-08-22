package org.scesi.demo.controllers;

import java.util.List;

import org.scesi.demo.repo.SubjectRepository;
import org.scesi.demo.clases.Subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")

public class SubjectController{
    
    @Autowired
    private SubjectRepository repo;

    @RequestMapping("/semester")
    public List<Subject> list(
        @RequestParam(value="sem",required=true) String sem){
        return repo.findBySemester(sem);
    }

    @GetMapping
    public List<Subject> all(){
        return repo.findAll();
    }

    @PutMapping
    public void modify(@RequestBody Subject sub){
        repo.save(sub);
    }
}