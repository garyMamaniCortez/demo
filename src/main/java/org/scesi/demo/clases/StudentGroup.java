package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "studentgroup")
@Data
public class StudentGroup{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Long idsg;

    @ManyToOne
    @JoinColumns(
        @JoinColumn (name="correo"),
        @JoinColumn (name="username")
    )
    private Student student;

    @ManyToOne
    @JoinColumn (name="idg")
    private Group group;
}