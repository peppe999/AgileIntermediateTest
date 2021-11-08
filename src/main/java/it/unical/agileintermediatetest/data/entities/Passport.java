package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

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

    @OneToOne(mappedBy = "passport")
    private Passenger passenger;

    public Passport() {
    }

    public Passport(Long id, Integer code, LocalDate expirationDate, LocalDate releaseDate, Passenger passenger) {
        this.id = id;
        this.code = code;
        this.expirationDate = expirationDate;
        this.releaseDate = releaseDate;
        this.passenger = passenger;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
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
        Passport passport = (Passport) o;
        return id.equals(passport.id) && code.equals(passport.code) && expirationDate.equals(passport.expirationDate) && releaseDate.equals(passport.releaseDate) && passenger.equals(passport.passenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, expirationDate, releaseDate, passenger);
    }
}
