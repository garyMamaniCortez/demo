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
@RequestMapping(path = "time_ofs")
public class Time_ofController {
    @Autowired
    private Time_ofService timeService;

    @PostMapping
    @RequestMapping()
    public ResponseEntity<Time_of> save(@RequestBody Time_ofDAO time) {
        return new ResponseEntity(timeService.addTime_of(time), HttpStatus.CREATED);
    }
}