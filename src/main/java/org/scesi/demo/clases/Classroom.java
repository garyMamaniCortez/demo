package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "classroom")
@Data
public class Classroom{
    @Id
    @Column(name="cod_cl")
    private String cod_cl;

    @Column(name="ubication")
    private String ubication;
}