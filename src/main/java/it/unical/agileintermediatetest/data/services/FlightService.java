package it.unical.agileintermediatetest.data.services;

import it.unical.agileintermediatetest.data.entities.Flight;
import it.unical.agileintermediatetest.data.entities.Ticket;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface FlightService {
    List<Flight> getAllFlights();

    Optional<List<Ticket>> getTicketsOfFlight(LocalDateTime departureDate, String fromD);

    Integer getCountByDepartureLocation(String fromD);

    @Transactional
    void deleteTicket(Long flightId);
}
