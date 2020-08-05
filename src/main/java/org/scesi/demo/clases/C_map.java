package org.scesi.demo.clases;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "c_map")
@Data
public class C_map {
    @Id
    @Column(name="ubication")
    private Long ubication;

    @Column(name="destiny")
    private Long destiny;

    @Column(name="cod_map")
    private String cod_map;
}