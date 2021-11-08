package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.PassportDAO;
import it.unical.agileintermediatetest.data.entities.Passport;
import it.unical.agileintermediatetest.data.services.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PassportServiceImpl implements PassportService {
    private final PassportDAO passportDAO;

    @Autowired
    public PassportServiceImpl(PassportDAO passportDAO) {
        this.passportDAO = passportDAO;
    }

    @Override
    public Optional<List<Passport>> getAllExpDateRange(LocalDate lower, LocalDate upper) {
        List<Passport> result =  passportDAO.findAllByExpirationDateBetween(lower, upper);
        if(result == null)
            return Optional.empty();
        else return Optional.of(result);
    }
}
