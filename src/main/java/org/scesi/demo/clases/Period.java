package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "period")
@Data
public class Period{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="cod_ti")
    private Long cod_ti;

    @Column(name="starts")
    private String starts;

    @Column(name="ends")
    private String ends;

    @OneToMany(mappedBy="time")
    private Set<Schedule> schedule;
}