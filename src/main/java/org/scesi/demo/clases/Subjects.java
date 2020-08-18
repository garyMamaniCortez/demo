package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "subjects")
@IdClass(value = SubjectsPK.class)
@Data
public class Subjects {
    @Id
    @Column(name="cod_cls")
    private String cod_cls;

    @Id
    @Column(name="group_of")
    private String group_of;

    @Column(name="name")
    private String name;

    @Column(name="semester")
    private char semester;

}