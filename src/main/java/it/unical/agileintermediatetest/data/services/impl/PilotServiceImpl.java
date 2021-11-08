package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.PilotDAO;
import it.unical.agileintermediatetest.data.services.PilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotServiceImpl implements PilotService {
    private final PilotDAO pilotDAO;

    @Autowired
    public PilotServiceImpl(PilotDAO pilotDAO) {
        this.pilotDAO = pilotDAO;
    }
}
