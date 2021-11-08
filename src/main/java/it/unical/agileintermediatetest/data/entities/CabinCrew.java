package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "CabinCrew")
@Inheritance(strategy = InheritanceType.JOINED)
public class CabinCrew {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Embedded
    private PersonalData personalData;

    @Column(name = "contract_number", unique = true)
    private Integer contractNumber;

    @ManyToMany(mappedBy = "cabinCrews")
    private List<Flight> flights;
}
