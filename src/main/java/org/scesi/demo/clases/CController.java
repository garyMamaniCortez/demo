package org.scesi.demo.clases;

import java.util.List;

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