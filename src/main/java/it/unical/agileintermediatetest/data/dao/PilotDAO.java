package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotDAO extends JpaRepository<Pilot, Long> {
}
