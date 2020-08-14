package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

import org.scesi.demo.clases.StudentPK;

@Entity
@Table(name = "student")
@IdClass(StudentPK.class)
@Data
public class Student {
    @Id
    @Column(name="correo")
    private String correo;

    @Id
    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    //@
}