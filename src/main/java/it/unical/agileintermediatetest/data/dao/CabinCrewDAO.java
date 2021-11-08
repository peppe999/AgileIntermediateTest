package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.CabinCrew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabinCrewDAO extends JpaRepository<CabinCrew, Long> {
}
