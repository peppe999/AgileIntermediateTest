package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.TicketDAO;
import it.unical.agileintermediatetest.data.entities.Passenger;
import it.unical.agileintermediatetest.data.entities.Ticket;
import it.unical.agileintermediatetest.data.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {
    private final TicketDAO ticketDAO;

    @Autowired
    public TicketServiceImpl(TicketDAO ticketDAO) {
        this.ticketDAO = ticketDAO;
    }

    @Override
    public Optional<List<Passenger>> getPassengersByFlightCod(Integer cod) {
        List<Ticket> tickets = ticketDAO.findAllByFlightCod(cod);
        if(tickets == null)
            return Optional.empty();

        List<Passenger> result = tickets.stream().map(Ticket::getPassenger).filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));
        return Optional.of(result);
    }

    @Override
    public Optional<List<Passenger>> getPassengersByFlightCodSpec(Integer cod) {
        List<Ticket> tickets = ticketDAO.findAll(ticketDAO.ticketFilter(cod));
        if(tickets.isEmpty())
            return Optional.empty();

        List<Passenger> result = tickets.stream().map(Ticket::getPassenger).filter(Objects::nonNull).collect(Collectors.toCollection(ArrayList::new));
        return Optional.of(result);
    }
}
