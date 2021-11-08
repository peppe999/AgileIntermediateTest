package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;

@Entity(name = "Airplane")
public class Airplane {

    enum Type {
        BOING_777,
        BOING_787,
        AIRBUS_A350,
        AIRBUS_A380
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "model_number")
    private Integer modelNumber;

    @Column(name = "seats_number")
    private Integer seatsNumber;

    @Enumerated(EnumType.STRING)
    @Basic(optional = false)
    @Column(name = "type")
    private Type type;
}
