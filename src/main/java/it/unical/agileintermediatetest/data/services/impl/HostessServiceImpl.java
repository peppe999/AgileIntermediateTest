package it.unical.agileintermediatetest.data.services.impl;

import it.unical.agileintermediatetest.data.dao.HostessDAO;
import it.unical.agileintermediatetest.data.services.HostessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HostessServiceImpl implements HostessService {
    private final HostessDAO hostessDAO;

    @Autowired
    public HostessServiceImpl(HostessDAO hostessDAO) {
        this.hostessDAO = hostessDAO;
    }
}
