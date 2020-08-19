package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "subject")
@IdClass(value = SubjectsPK.class)
@Data
public class Subject {//controller y service(documentacion jpa repository)
    @Id
    @Column(name="cod_cls")
    private String cod_cls;

    @Column(name="name")
    private String name;

    @Column(name="semester")
    private char semester;

    @OneToMany(mappedBy= "subjects")
    private Set<Group> grupo;
}