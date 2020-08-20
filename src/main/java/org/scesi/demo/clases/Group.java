package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "group")
@Data
public class Group{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="idg")
    private Long idg;

    @Column(name="teacher")
    private String teacher;

    @Column(name="grupo")
    private int grupo;

    @ManyToOne
    @JoinColumn(name="cod_cls",nullable = false)
    private Subject subjects;

    @OneToMany(mappedBy="grupo")
    private Set<Schedule> schedule;

    @OneToMany(mappedBy="group")
    private Set<StudentGroup> studentgroup;
}