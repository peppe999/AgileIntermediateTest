package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity(name = "Hostess")
public class Hostess extends CabinCrew {
    public enum Gender {
        MALE,
        FEMALE
    }

    @Enumerated(EnumType.STRING)
    @Basic(optional = false)
    @Column(name = "gender")
    private Gender gender;

    public Hostess(Gender gender) {
        this.gender = gender;
    }

    public Hostess(Long id, PersonalData personalData, Integer contractNumber, List<Flight> flights, Gender gender) {
        super(id, personalData, contractNumber, flights);
        this.gender = gender;
    }

    public Hostess() {}

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hostess hostess = (Hostess) o;
        return gender == hostess.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gender);
    }
}
