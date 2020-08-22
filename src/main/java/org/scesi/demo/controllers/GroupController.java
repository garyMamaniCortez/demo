package org.scesi.demo.controllers;

import java.util.List;
import org.scesi.demo.repo.GroupRepository;
import org.scesi.demo.clases.Group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/group")

public class GroupController{

    @Autowired
    private GroupRepository repo;

    @GetMapping
    public List<Group> list(){
        return repo.findAll();
    }

    @PutMapping
    public void modify(@RequestBody Group g){
        repo.save(g);
    }
}