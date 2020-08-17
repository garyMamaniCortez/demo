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
@RequestMapping(path = "schedules")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @PostMapping
    @RequestMapping()
    public ResponseEntity<Schedule> save(@RequestBody ScheduleDAO schedule) {
        return new ResponseEntity(scheduleService.addSchedule(schedule), HttpStatus.CREATED);
    }
}