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
@RequestMapping(path = "days")
public class DayController {
    @Autowired
    private DayService dayService;

    @PostMapping
    @RequestMapping()
    public ResponseEntity<Day> save(@RequestBody DayDAO day) {
        return new ResponseEntity(dayService.addDay(day), HttpStatus.CREATED);
    }
}