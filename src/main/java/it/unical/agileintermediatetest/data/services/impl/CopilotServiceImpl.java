package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.CopilotDAO;
import it.unical.agileintermediatetest.data.services.CopilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopilotServiceImpl implements CopilotService {
    private final CopilotDAO copilotDAO;

    @Autowired
    public CopilotServiceImpl(CopilotDAO copilotDAO) {
        this.copilotDAO = copilotDAO;
    }
}
