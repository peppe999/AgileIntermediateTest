package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;

@Entity(name = "Airline")
public class Airline {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Basic(optional = false)
    @Column(name = "nation")
    private String nation;

    @Column(name = "name")
    private String address;

    @Column(name = "logo")
    private String logo;
}
