package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.AirplaneDAO;
import it.unical.agileintermediatetest.data.services.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirplaneServiceImpl implements AirplaneService {
    private final AirplaneDAO AirplaneDAO;
    
    @Autowired
    public AirplaneServiceImpl(AirplaneDAO AirplaneDAO) {
        this.AirplaneDAO = AirplaneDAO;
    }
}
