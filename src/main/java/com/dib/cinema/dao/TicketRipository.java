package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dib.cinema.entities.Ticket;

public interface TicketRipository extends JpaRepository<Ticket,Long> {

}
