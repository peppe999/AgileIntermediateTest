package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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

    @OneToMany(mappedBy = "airplane")
    private List<Flight> flights;

    @ManyToOne()
    @JoinColumn(name = "Airline_id")
    private Airline airline;

    public Airplane() {
    }

    public Airplane(Long id, Integer modelNumber, Integer seatsNumber, Type type, List<Flight> flights, Airline airline) {
        this.id = id;
        this.modelNumber = modelNumber;
        this.seatsNumber = seatsNumber;
        this.type = type;
        this.flights = flights;
        this.airline = airline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(Integer modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Integer getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(Integer seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return id.equals(airplane.id) && modelNumber.equals(airplane.modelNumber) && seatsNumber.equals(airplane.seatsNumber) && type == airplane.type && flights.equals(airplane.flights) && airline.equals(airplane.airline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelNumber, seatsNumber, type, flights, airline);
    }
}
