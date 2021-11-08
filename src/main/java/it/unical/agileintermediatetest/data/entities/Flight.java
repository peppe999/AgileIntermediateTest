package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"departure_date", "from"}))
@Entity(name = "Flight")
public class Flight {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "cod")
    private Integer cod;

    @Basic(optional = false)
    @Column(name = "from")
    private String from;

    @Basic(optional = false)
    @Column(name = "to")
    private String to;

    @Basic(optional = false)
    @Column(name = "departure_date")
    private LocalDateTime departureDate;

    @Column(name = "arrival_date")
    private LocalDateTime arrivalDate;

    @Column(name = "isCancelled")
    private Boolean isCancelled;

    @ManyToMany()
    @JoinTable(name = "Flight_CabinCrew",
            joinColumns = @JoinColumn(name = "Flight_id"),
            inverseJoinColumns = @JoinColumn(name = "CabinCrew_id"))
    private List<CabinCrew> cabinCrews;

    @ManyToOne()
    @JoinColumn(name = "Airplane_id")
    private Airplane airplane;

    @OneToMany(mappedBy = "flight")
    private List<Ticket> tickets;

    public Flight() {
    }

    public Flight(Long id, Integer cod, String from, String to, LocalDateTime departureDate, LocalDateTime arrivalDate, Boolean isCancelled, List<CabinCrew> cabinCrews, Airplane airplane, List<Ticket> tickets) {
        this.id = id;
        this.cod = cod;
        this.from = from;
        this.to = to;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.isCancelled = isCancelled;
        this.cabinCrews = cabinCrews;
        this.airplane = airplane;
        this.tickets = tickets;
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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Boolean getCancelled() {
        return isCancelled;
    }

    public void setCancelled(Boolean cancelled) {
        isCancelled = cancelled;
    }

    public List<CabinCrew> getCabinCrews() {
        return cabinCrews;
    }

    public void setCabinCrews(List<CabinCrew> cabinCrews) {
        this.cabinCrews = cabinCrews;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return id.equals(flight.id) && cod.equals(flight.cod) && from.equals(flight.from) && to.equals(flight.to) && departureDate.equals(flight.departureDate) && arrivalDate.equals(flight.arrivalDate) && isCancelled.equals(flight.isCancelled) && cabinCrews.equals(flight.cabinCrews) && airplane.equals(flight.airplane) && tickets.equals(flight.tickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cod, from, to, departureDate, arrivalDate, isCancelled, cabinCrews, airplane, tickets);
    }
}
