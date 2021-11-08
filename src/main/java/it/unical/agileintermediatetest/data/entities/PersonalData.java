package it.unical.agileintermediatetest.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonalData {

    @Basic(optional = false)
    @Column(name = "fiscalcode", unique = true)
    private String fiscalCode;

    @Basic(optional = false)
    @Column(name = "firstname")
    private String firstName;

    @Basic(optional = false)
    @Column(name = "lastname")
    private String lastName;
}
