package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PassportDAO extends JpaRepository<Passport, Long> {
    List<Passport> findAllByExpirationDateBetween(LocalDate lower, LocalDate upper);
}
