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
@RequestMapping(path = "teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping
    @RequestMapping()
    public ResponseEntity<Teacher> save(@RequestBody TeacherDAO teacher) {
        return new ResponseEntity(teacherService.addTeacher(teacher), HttpStatus.CREATED);
    }
}