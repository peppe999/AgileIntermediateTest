package it.unical.agileintermediatetest.services;

import it.unical.agileintermediatetest.data.dao.TicketDAO;
import it.unical.agileintermediatetest.data.entities.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
public class RandomManageService {
    private final TicketDAO ticketDAO;

    @Transactional
    public void manageTicket(Ticket ticket) {
        Random random = new Random();
        ticket.setIsWinner(random.nextBoolean());
        ticket.setPrice(0d);
        ticketDAO.save(ticket);
    }

    @Autowired
    public RandomManageService(TicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }
}
