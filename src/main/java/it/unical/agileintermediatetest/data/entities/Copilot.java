package it.unical.agileintermediatetest.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;

@Entity(name = "Copilot")
public class Copilot extends CabinCrew {

    @Column(name = "flight_hours")
    private Integer flightHours;

    public Copilot(Long id, PersonalData personalData, Integer contractNumber, List<Flight> flights, Integer flightHours) {
        super(id, personalData, contractNumber, flights);
        this.flightHours = flightHours;
    }

    public Copilot() {

    }

    public Copilot(Integer flightHours) {
        this.flightHours = flightHours;
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
        Copilot copilot = (Copilot) o;
        return flightHours.equals(copilot.flightHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flightHours);
    }
}
