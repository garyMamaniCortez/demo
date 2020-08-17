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
@RequestMapping(path = "students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    @RequestMapping()
    public ResponseEntity<Student> save(@RequestBody StudentDAO student) {
        return new ResponseEntity(studentService.addStudent(student), HttpStatus.CREATED);
    }
}