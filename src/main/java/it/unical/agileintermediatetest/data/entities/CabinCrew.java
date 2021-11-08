package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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

    public CabinCrew() {
    }

    public CabinCrew(Long id, PersonalData personalData, Integer contractNumber, List<Flight> flights) {
        this.id = id;
        this.personalData = personalData;
        this.contractNumber = contractNumber;
        this.flights = flights;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CabinCrew cabinCrew = (CabinCrew) o;
        return id.equals(cabinCrew.id) && personalData.equals(cabinCrew.personalData) && contractNumber.equals(cabinCrew.contractNumber) && flights.equals(cabinCrew.flights);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personalData, contractNumber, flights);
    }
}
