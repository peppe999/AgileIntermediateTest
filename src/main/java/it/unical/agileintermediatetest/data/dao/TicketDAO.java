package it.unical.agileintermediatetest.data.dao;

import it.unical.agileintermediatetest.data.entities.Passenger;
import it.unical.agileintermediatetest.data.entities.Ticket;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.Predicate;
import java.util.List;

@Repository
public interface TicketDAO extends JpaRepository<Ticket, Long>, JpaSpecificationExecutor<Ticket> {
    List<Ticket> findAllByFlightCod(Integer cod);

    @Query("from Ticket t where t.flight.cod = :cod")
    List<Ticket> getAllByCod(Integer cod);

    default Specification<Ticket> ticketFilter(Integer flightCod) {
        return (root, query, criteriaBuilder) -> {
            Predicate predicate = criteriaBuilder.equal(root.get("flight").get("cod"), flightCod);
            return query.where(predicate).distinct(true).getRestriction();
        };
    }
}
