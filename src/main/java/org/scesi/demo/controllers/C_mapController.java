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
@RequestMapping(path = "C_maps")
public class ScheduleController {
    @Autowired
    private C_mapService mapService;

    @PostMapping
    @RequestMapping()
    public ResponseEntity<C_map> save(@RequestBody C_mapDAO map) {
        return new ResponseEntity(mapService.addMap(map), HttpStatus.CREATED);
    }
}