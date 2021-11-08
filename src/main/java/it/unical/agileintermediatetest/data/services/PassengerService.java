package it.unical.agileintermediatetest.data.services;

import it.unical.agileintermediatetest.data.dao.spec.PassengerSpecification;
import it.unical.agileintermediatetest.data.entities.Passenger;

import java.util.List;
import java.util.Optional;

public interface PassengerService {
    Optional<List<Passenger>> getAllByFirstAndLastName(String firstName, String lastName);

    Optional<List<Passenger>> getAllByFilter(PassengerSpecification.Filter filter);
}
