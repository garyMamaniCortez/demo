package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "student")
@IdClass(value = StudentPK.class)
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