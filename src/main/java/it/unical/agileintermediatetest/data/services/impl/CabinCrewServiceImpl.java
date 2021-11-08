package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.CabinCrewDAO;
import it.unical.agileintermediatetest.data.services.CabinCrewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabinCrewServiceImpl implements CabinCrewService {
    private final CabinCrewDAO cabinCrewDAO;

    @Autowired
    public CabinCrewServiceImpl(CabinCrewDAO cabinCrewDAO) {
        this.cabinCrewDAO = cabinCrewDAO;
    }
}
