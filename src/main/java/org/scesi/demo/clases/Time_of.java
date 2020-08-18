package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "time_of")
@Data
public class Time_of{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="cod_ti")
    private Long cod_ti;

    @Column(name="starts")
    private String starts;

    @Column(name="ends")
    private String ends;

}