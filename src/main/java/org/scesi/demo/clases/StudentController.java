package org.scesi.demo.clases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")

public class StudentController{

    @Autowired
    private StudentRepository repo;

    @RequestMapping("/login")
    public boolean login(
        @RequestParam(value="correo",required=true) String correo,
        @RequestParam(value="pswrd",required=true) String pswrd){
        boolean res=true;
        Student s=repo.findByCorreoAndPassword(correo,pswrd);
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