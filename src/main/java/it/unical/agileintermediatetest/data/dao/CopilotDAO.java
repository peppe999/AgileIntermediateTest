package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.Copilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CopilotDAO extends JpaRepository<Copilot, Long> {
}
