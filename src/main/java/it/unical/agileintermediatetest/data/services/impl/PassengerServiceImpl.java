package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.PassengerDAO;
import it.unical.agileintermediatetest.data.dao.spec.PassengerSpecification;
import it.unical.agileintermediatetest.data.entities.Passenger;
import it.unical.agileintermediatetest.data.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService {
    private final PassengerDAO passengerDAO;

    @Autowired
    public PassengerServiceImpl(PassengerDAO passengerDAO) {
        this.passengerDAO = passengerDAO;
    }

    @Override
    public Optional<List<Passenger>> getAllByFirstAndLastName(String firstName, String lastName) {
        List<Passenger> result = passengerDAO.findAllByPersonalDataFirstNameAndPersonalDataLastName(firstName, lastName);
        if(result == null)
            return Optional.empty();
        else return Optional.of(result);
    }

    @Override
    public Optional<List<Passenger>> getAllByFilter(PassengerSpecification.Filter filter) {
        List<Passenger> result = passengerDAO.findAll(PassengerSpecification.getSpecFilter(filter));
        if(result.isEmpty())
            return Optional.empty();
        else return Optional.of(result);
    }
}
