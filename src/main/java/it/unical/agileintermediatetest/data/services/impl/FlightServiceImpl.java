package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.FlightDAO;
import it.unical.agileintermediatetest.data.dao.TicketDAO;
import it.unical.agileintermediatetest.data.entities.Flight;
import it.unical.agileintermediatetest.data.entities.Ticket;
import it.unical.agileintermediatetest.data.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {
    private final FlightDAO flightDAO;
    private final TicketDAO ticketDAO;

    @Autowired
    public FlightServiceImpl(FlightDAO flightDAO, TicketDAO ticketDAO) {
        this.flightDAO = flightDAO;
        this.ticketDAO = ticketDAO;
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightDAO.findAll();
    }

    @Override
    public Optional<List<Ticket>> getTicketsOfFlight(LocalDateTime departureDate, String fromD) {
        Flight f = flightDAO.findFlightByDepartureDateAndFromD(departureDate, fromD);
        if(f == null)
            return Optional.empty();

        // Ho impostato FetchType uguale a EAGER
        return Optional.of(f.getTickets());

    }

    @Override
    public Integer getCountByDepartureLocation(String fromD) {
        return flightDAO.countAllByFromD(fromD);
    }

    @Override
    @Transactional
    public void deleteTicket(Long flightId) {
        Optional<Flight> f = flightDAO.findById(flightId);
        if(f.isPresent()) {
            List<Ticket> tickets = f.get().getTickets();
            if(tickets != null)
                ticketDAO.deleteAll(tickets);
        }
    }


}
