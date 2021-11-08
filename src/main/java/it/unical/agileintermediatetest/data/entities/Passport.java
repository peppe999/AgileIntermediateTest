package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Passport")
public class Passport {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "email", unique = true)
    private Integer code;

    @Basic(optional = false)
    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Basic(optional = false)
    @Column(name = "release_date")
    private LocalDate releaseDate;
}
