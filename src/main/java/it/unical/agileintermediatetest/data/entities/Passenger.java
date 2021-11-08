package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity(name = "Passenger")
public class Passenger {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Embedded
    private PersonalData personalData;

    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    @Basic(optional = false)
    @Column(name = "birthdate")
    private LocalDate birthDate;

    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets;

    @OneToOne()
    @JoinColumn(name = "Passport_id")
    private Passport passport;

    public Passenger() {
    }

    public Passenger(Long id, PersonalData personalData, String email, LocalDate birthDate, List<Ticket> tickets, Passport passport) {
        this.id = id;
        this.personalData = personalData;
        this.email = email;
        this.birthDate = birthDate;
        this.tickets = tickets;
        this.passport = passport;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return id.equals(passenger.id) && personalData.equals(passenger.personalData) && email.equals(passenger.email) && birthDate.equals(passenger.birthDate) && tickets.equals(passenger.tickets) && passport.equals(passenger.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personalData, email, birthDate, tickets, passport);
    }
}
