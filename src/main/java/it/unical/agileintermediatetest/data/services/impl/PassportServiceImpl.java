package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.PassportDAO;
import it.unical.agileintermediatetest.data.services.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService {
    private final PassportDAO PassportDAO;

    @Autowired
    public PassportServiceImpl(PassportDAO PassportDAO) {
        this.PassportDAO = PassportDAO;
    }
}
