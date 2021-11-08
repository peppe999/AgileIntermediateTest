package it.unical.agileintermediatetest.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;

@Entity(name = "Pilot")
public class Pilot extends CabinCrew {

    @Basic(optional = false)
    @Column(name = "pilot_license")
    private String pilotLicense;

    @Basic(optional = false)
    @Column(name = "flight_hours")
    private Integer flightHours;

    public Pilot(Long id, PersonalData personalData, Integer contractNumber, List<Flight> flights, String pilotLicense, Integer flightHours) {
        super(id, personalData, contractNumber, flights);
        this.pilotLicense = pilotLicense;
        this.flightHours = flightHours;
    }

    public Pilot(String pilotLicense, Integer flightHours) {
        this.pilotLicense = pilotLicense;
        this.flightHours = flightHours;
    }

    public Pilot() {

    }

    public String getPilotLicense() {
        return pilotLicense;
    }

    public void setPilotLicense(String pilotLicense) {
        this.pilotLicense = pilotLicense;
    }

    public Integer getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(Integer flightHours) {
        this.flightHours = flightHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pilot pilot = (Pilot) o;
        return pilotLicense.equals(pilot.pilotLicense) && flightHours.equals(pilot.flightHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pilotLicense, flightHours);
    }
}
