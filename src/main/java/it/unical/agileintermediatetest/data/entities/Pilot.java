package it.unical.agileintermediatetest.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "Pilot")
public class Pilot extends CabinCrew {

    @Basic(optional = false)
    @Column(name = "pilot_license")
    private String pilotLicense;

    @Basic(optional = false)
    @Column(name = "flight_hours")
    private Integer flightHours;
}
