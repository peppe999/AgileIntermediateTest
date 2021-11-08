package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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
}
