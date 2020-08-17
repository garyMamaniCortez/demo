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
@RequestMapping(path = "classrooms")
public class ClassroomController {
    @Autowired
    private ClassroomService classroomService;

    @PostMapping
    @RequestMapping()
    public ResponseEntity<Classroom> save(@RequestBody ClassroomDAO classroom) {
        return new ResponseEntity(classroomService.addClassroom(classroom), HttpStatus.CREATED);
    }
}