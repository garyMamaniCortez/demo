package org.scesi.demo.clases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sg")

public class SGController{

    @Autowired
    private StudentGroupRepository repo;

    @GetMapping
    public List<StudentGroup> list(@RequestBody String correo){
        return repo.findByStudent_Correo(correo);
    }

    @PostMapping
    public void insert(@RequestBody StudentGroup stu){
        repo.save(stu);
    }
}