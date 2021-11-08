package it.unical.agileintermediatetest.data.services;

import it.unical.agileintermediatetest.data.entities.Passenger;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    Optional<List<Passenger>> getPassengersByFlightCod(Integer cod);

    Optional<List<Passenger>> getPassengersByFlightCodSpec(Integer cod);
}
