package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
@IdClass(value = StudentPK.class)
@Data
public class Student implements Serializable{
    @Id
    @Column(name="correo")
    private String correo;

    @Id
    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @OneToMany(mappedBy="student")
    private Set<StudentGroup> studentgroup;
}