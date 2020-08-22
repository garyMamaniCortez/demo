package org.scesi.demo.clases;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "subject")
@Data
public class Subject {//controller y service(documentacion jpa repository)
    @Id
    @Column(name="cod_cls")
    private String cod_cls;

    @Column(name="name")
    private String name;

    @Column(name="semester")
    private String semester;
}