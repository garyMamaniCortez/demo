package org.scesi.demo.clases;

import java.util.List;

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