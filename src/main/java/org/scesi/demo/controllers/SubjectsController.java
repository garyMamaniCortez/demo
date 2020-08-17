package org.scesi.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.scesi.demo.*;

@Controller
@RequestMapping(path = "subjectss")
public class SubjectsController {
    @Autowired
    private SubjectsService subjectsService;

    @PostMapping
    @RequestMapping()
    public ResponseEntity<Subjects> save(@RequestBody SubjectsDAO subjects) {
        return new ResponseEntity(subjectsService.addSubjects(subjects), HttpStatus.CREATED);
    }
}