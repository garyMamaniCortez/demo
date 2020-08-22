package org.scesi.demo.clases;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "groups")
@Data
public class Group{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="idg")
    private Long idg;

    @Column(name="teacher")
    private String teacher;

    @Column(name="grupo")
    private String grupo;

    @ManyToOne
    @JoinColumn(name="cod_cls",nullable = false)
    private Subject subjects;
}