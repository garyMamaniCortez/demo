package org.scesi.demo.clases;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student")
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
}