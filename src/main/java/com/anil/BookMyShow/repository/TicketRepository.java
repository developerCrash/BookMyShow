package com.anil.BookMyShow.repository;

import com.anil.BookMyShow.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Override
    Optional<Ticket> findById(Long ticketId);
    @Override
    Ticket save(Ticket ticketId);
}
