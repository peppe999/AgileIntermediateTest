package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.AirlineDAO;
import it.unical.agileintermediatetest.data.services.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirlineServiceImpl implements AirlineService {
    private final AirlineDAO airlineDAO;

    @Autowired
    public AirlineServiceImpl(AirlineDAO airlineDAO) {
        this.airlineDAO = airlineDAO;
    }
}
