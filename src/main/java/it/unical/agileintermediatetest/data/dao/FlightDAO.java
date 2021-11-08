package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FlightDAO extends JpaRepository<Flight, Long> {
    Flight findFlightByDepartureDateAndFromD(LocalDateTime departureDate, String fromD);

    Integer countAllByFromD(String fromD);
}
