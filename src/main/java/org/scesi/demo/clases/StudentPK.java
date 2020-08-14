package org.scesi.demo.clases;

import lombok.Data;

@Data
public class StudentPK{
    private String correo;
    private String username;
    public StudentPK(String correo,String username){
        super();
        this.correo=correo;
        this.username=username;
    }
}