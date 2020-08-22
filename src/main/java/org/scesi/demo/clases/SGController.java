package org.scesi.demo.clases;

import java.util.List;
import java.util.ArrayList;

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