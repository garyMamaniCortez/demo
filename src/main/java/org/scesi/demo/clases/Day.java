package org.scesi.demo.clases;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "day") 
@Data
public class Day {
    @Id
    private Long day;
}