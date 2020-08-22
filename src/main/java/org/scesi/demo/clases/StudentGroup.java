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
    @Column(name="idsg")
    private Long idsg;

    @ManyToOne
    @JoinColumn (name="correo",referencedColumnName="correo")
    private Student student;

    @ManyToOne
    @JoinColumn (name="idg")
    private Group group;
}