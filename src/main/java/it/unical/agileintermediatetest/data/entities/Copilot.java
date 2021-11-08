package it.unical.agileintermediatetest.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Copilot")
public class Copilot extends CabinCrew {

    @Column(name = "flight_hours")
    private Integer flightHours;
}
