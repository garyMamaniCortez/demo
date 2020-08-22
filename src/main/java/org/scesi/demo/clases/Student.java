package org.scesi.demo.clases;

import lombok.Data;
import java.util.List;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
@Data
public class Student{
    @Id
    @Column(name="correo")
    private String correo;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    public String getPassword(){
        return password;
    }
}