package org.scesi.demo.clases;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
@Data
public class Teacher {
    @Id
    @Column(name="full_name")
    private String full_name;

    @Column(name="degrees")
    private String degrees;
}