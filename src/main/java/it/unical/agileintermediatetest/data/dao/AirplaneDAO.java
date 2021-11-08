package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneDAO extends JpaRepository<Airplane, Long> {
    List<Airplane> findAllByTypeAndModelNumberAndAirlineNameAndSeatsNumberGreaterThan(Airplane.Type type, Integer modelNumber, String airlineName, Integer seatsNumber);

    @Query("from Airplane a where a.type = :type and a.modelNumber = :modelNumber and a.airline.name = :airlineName and a.seatsNumber > :seatsNumber")
    List<Airplane> getAllByALotOfStuff(Airplane.Type type, Integer modelNumber, String airlineName, Integer seatsNumber);
}
