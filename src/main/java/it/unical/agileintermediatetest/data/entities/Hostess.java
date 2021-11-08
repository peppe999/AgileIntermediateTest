package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;

@Entity(name = "Hostess")
public class Hostess extends CabinCrew {
    enum Gender {
        MALE,
        FEMALE
    }

    @Enumerated(EnumType.STRING)
    @Basic(optional = false)
    @Column(name = "gender")
    private Gender gender;
}
