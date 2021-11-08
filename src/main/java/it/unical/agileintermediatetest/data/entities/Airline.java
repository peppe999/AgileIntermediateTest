package it.unical.agileintermediatetest.data.entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity(name = "Airline")
public class Airline {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Basic(optional = false)
    @Column(name = "nation")
    private String nation;

    @Column(name = "name")
    private String address;

    @Column(name = "logo")
    private Byte[] logo;

    @OneToMany(mappedBy = "airline")
    private List<Airplane> airplanes;

    public Airline() {
    }

    public Airline(Long id, String name, String nation, String address, Byte[] logo, List<Airplane> airplanes) {
        this.id = id;
        this.name = name;
        this.nation = nation;
        this.address = address;
        this.logo = logo;
        this.airplanes = airplanes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte[] getLogo() {
        return logo;
    }

    public void setLogo(Byte[] logo) {
        this.logo = logo;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return id.equals(airline.id) && name.equals(airline.name) && nation.equals(airline.nation) && address.equals(airline.address) && Arrays.equals(logo, airline.logo) && airplanes.equals(airline.airplanes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, nation, address, airplanes);
        result = 31 * result + Arrays.hashCode(logo);
        return result;
    }
}
