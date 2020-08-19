package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "schedule")
@Data
public class Schedule{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="ids")
    private Long ids;

    @Column(name="classroom")
    private String classroom;

    @Column(name="day")
    private String day;

    @ManyToOne
    @JoinColumn(name="idg")
    private Group grupo;

    @ManyToOne
    @JoinColumn(name="cod_ti")
    private Period time;//periodo
}