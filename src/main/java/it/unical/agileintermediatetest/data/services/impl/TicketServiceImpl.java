package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.TicketDAO;
import it.unical.agileintermediatetest.data.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketDAO TicketDAO;

    @Autowired
    public TicketServiceImpl(TicketDAO TicketDAO) {
        this.TicketDAO = TicketDAO;
    }
}
