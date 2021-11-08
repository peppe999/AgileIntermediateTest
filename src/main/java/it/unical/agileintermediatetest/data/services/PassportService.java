package it.unical.agileintermediatetest.data.services;

import it.unical.agileintermediatetest.data.entities.Passport;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PassportService {
    Optional<List<Passport>> getAllExpDateRange(LocalDate lower, LocalDate upper);
}
