package org.scesi.demo.clases;

import lombok.Data;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "day") 
@Data
public class Day {
    @Id
    @Column(name="day")
    private String day;

    @OneToMany(mappedBy="day")
    private Set<Schedule> DS;//Day Schedule
}