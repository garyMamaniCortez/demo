package org.scesi.demo.controllers;

import java.util.List;
import org.scesi.demo.repo.ScheduleRepository;
import org.scesi.demo.clases.Schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedule")

public class ScheduleController{

    @Autowired
    private ScheduleRepository repo;

    @GetMapping
    public List<Schedule> list(){
        return repo.findAll();
    }
}