package it.unical.agileintermediatetest.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotDAO extends JpaRepository<PilotDAO, Long> {
}