package org.scesi.demo.clases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")

public class SubjectController{
    
    @Autowired
    private SubjectRepository repo;

    @GetMapping
    public List<Subject> list(@RequestBody String semester){
        return repo.findBySemester(semester);
    }

    @PutMapping
    public void modify(@RequestBody Subject sub){
        repo.save(sub);
    }
}