package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.AirplaneDAO;
import it.unical.agileintermediatetest.data.entities.Airplane;
import it.unical.agileintermediatetest.data.services.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneServiceImpl implements AirplaneService {
    private final AirplaneDAO airplaneDAO;
    
    @Autowired
    public AirplaneServiceImpl(AirplaneDAO airplaneDAO) {
        this.airplaneDAO = airplaneDAO;
    }

    public Optional<List<Airplane>> getAirplanesBy(Airplane.Type type, Integer modelNumber, String airlineName, Integer seatsNumber) {
        List<Airplane> result = airplaneDAO.getAllByALotOfStuff(type, modelNumber, airlineName, seatsNumber);

        if(result == null)
            return Optional.empty();
        else return Optional.of(result);
    }
}
