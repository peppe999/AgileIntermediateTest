package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(name = "Ticket")
public class Ticket {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "cod", unique = true)
    private Integer cod;

    @Basic(optional = false)
    @Column(name = "price")
    private Double price;

    @Basic(optional = false)
    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

    @ManyToOne()
    @JoinColumn(name = "Flight_id")
    private Flight flight;

    @ManyToOne()
    @JoinColumn(name = "Passenger_id")
    private Passenger passenger;

    @Transient
    private transient Boolean isWinner;

    public Ticket() {
    }

    public Boolean getIsWinner() {
        return isWinner;
    }

    public void setIsWinner(Boolean winner) {
        isWinner = winner;
    }

    public Ticket(Long id, Integer cod, Double price, LocalDateTime purchaseDate, Flight flight, Passenger passenger) {
        this.id = id;
        this.cod = cod;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.flight = flight;
        this.passenger = passenger;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id.equals(ticket.id) && cod.equals(ticket.cod) && price.equals(ticket.price) && purchaseDate.equals(ticket.purchaseDate) && flight.equals(ticket.flight) && passenger.equals(ticket.passenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cod, price, purchaseDate, flight, passenger);
    }
}
