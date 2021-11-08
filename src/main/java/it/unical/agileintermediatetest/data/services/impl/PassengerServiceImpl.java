package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.PassengerDAO;
import it.unical.agileintermediatetest.data.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl implements PassengerService {
    private final PassengerDAO PassengerDAO;

    @Autowired
    public PassengerServiceImpl(PassengerDAO PassengerDAO) {
        this.PassengerDAO = PassengerDAO;
    }
}
