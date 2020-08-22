package org.scesi.demo.controllers;

import java.util.List;
import org.scesi.demo.repo.C_mapRepository;
import org.scesi.demo.clases.C_map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/map")

public class CController{

    @Autowired
    private C_mapRepository repo;

    @GetMapping
    public List<C_map> list(){
        return repo.findAll();
    }
}