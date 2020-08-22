package org.scesi.demo.controllers;

import java.util.List;

import org.scesi.demo.repo.StudentRepository;
import org.scesi.demo.repo.StudentGroupRepository;
import org.scesi.demo.repo.GroupRepository;

import org.scesi.demo.clases.Student;
import org.scesi.demo.clases.SGDAO;
import org.scesi.demo.clases.StudentGroup;
import org.scesi.demo.clases.Group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sg")

public class SGController{

    @Autowired
    private StudentGroupRepository repo;
    
    @Autowired
    private StudentRepository srepo;

    @Autowired
    private GroupRepository grepo;

    @RequestMapping("/groups")
    public List<StudentGroup> list(
        @RequestParam(value="correo",required=true) String correo){
        return repo.findByStudent_Correo(correo);
    }

    @PostMapping
    public void insert(@RequestBody SGDAO dao){
        Long [] grupos=dao.getGrupos();
        Student stu= srepo.getOne(dao.getCorreo());
        for(int i=0;i<grupos.length;i++){
            Group gro= grepo.getOne(grupos[i]);
            StudentGroup sg=new StudentGroup();
            sg.setStudent(stu);
            sg.setGroup(gro);
            repo.save(sg);
        }
    }
}