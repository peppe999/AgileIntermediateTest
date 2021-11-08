package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.FlightDAO;
import it.unical.agileintermediatetest.data.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {
    private final FlightDAO FlightDAO;

    @Autowired
    public FlightServiceImpl(FlightDAO FlightDAO) {
        this.FlightDAO = FlightDAO;
    }
}
