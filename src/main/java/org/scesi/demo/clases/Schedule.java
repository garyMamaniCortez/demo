package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "schedule")
@Data
public class Schedule{
    /*@Column(name="cod_cls")
    private String cod_cls;

    @Column(name="group_of")
    private String group_of;

    @Column(name="day")
    private String day;

    @Column(name="full_name")
    private String full_name;

    @Column(name="cod_ti")
    private int cod_ti;

    @Column(name="cod_cl")
    private String cod_cl;*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name="cod_cls",referencedColumnName="cod_cls"),
        @JoinColumn(name="group_of",referencedColumnName="group_of")
    })
    private Subjects sub;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="day",referencedColumnName="day")
    private Day d;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="full_name",referencedColumnName="full_name")
    private Teacher tchr;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cod_ti",referencedColumnName="cod_ti")
    private Time_of time;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cod_cl",referencedColumnName="cod_cl")
    private Classroom classroom;
}