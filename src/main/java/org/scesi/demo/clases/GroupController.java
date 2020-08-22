package org.scesi.demo.clases;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/group")

public class GroupController{

    @Autowired
    private GroupRepository repo;
    
    /*@GetMapping
    public List<Group> list(@RequestBody Subject subject){
        return repo.findBySubjects(subject);
    }*/

    @GetMapping
    public List<Group> list(){
        return repo.findAll();
    }

    @PutMapping
    public void modify(@RequestBody Group g){
        repo.save(g);
    }
}