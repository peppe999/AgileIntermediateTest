package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineDAO extends JpaRepository<Airline, Long> {
}
