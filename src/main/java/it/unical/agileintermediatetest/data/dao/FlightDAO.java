package it.unical.agileintermediatetest.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDAO extends JpaRepository<FlightDAO, Long> {
}
