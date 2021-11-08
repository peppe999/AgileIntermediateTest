package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerDAO extends JpaRepository<Passenger, Long>, JpaSpecificationExecutor<Passenger> {
    List<Passenger> findAllByPersonalDataFirstNameAndPersonalDataLastName(String firstName, String lastName);
}
