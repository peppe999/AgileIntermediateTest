package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Passenger")
public class Passenger {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Embedded
    private PersonalData personalData;

    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    @Basic(optional = false)
    @Column(name = "birthdate")
    private LocalDate birthDate;
}
