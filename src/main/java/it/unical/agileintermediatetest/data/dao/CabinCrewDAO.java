package it.unical.agileintermediatetest.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabinCrewDAO extends JpaRepository<CabinCrewDAO, Long> {
}
