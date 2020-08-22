package org.scesi.demo.clases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")

public class StudentController{

    @Autowired
    private StudentRepository repo;

    @GetMapping
    public boolean login(@RequestBody Stu stu){
        boolean res=true;
        Student s=repo.findByCorreoAndPassword(stu.getCorreo(),stu.getPassword());
        if(s==null)
            res=false;
        return res;
    }

    @PostMapping
    public void insert(@RequestBody Student stu){
        repo.save(stu);
    }

    @PutMapping
    public void modify(@RequestBody Student stu){
        repo.save(stu);
    }
}