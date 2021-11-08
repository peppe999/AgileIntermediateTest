package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

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
}
