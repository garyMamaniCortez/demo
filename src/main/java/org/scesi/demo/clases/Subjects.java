package org.scesi.demo.clases;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
@Data
public class Subjects {
    @Id
    @Column(name="cod_cls")
    private Long cod_cls;

    @Column(name="group_of")
    private String group_of;

    @Column(name="name")
    private String name;

    @Column(name="semester")
    private char semester;
}