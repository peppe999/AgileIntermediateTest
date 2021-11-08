package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.Hostess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostessDAO extends JpaRepository<Hostess, Long> {
}
