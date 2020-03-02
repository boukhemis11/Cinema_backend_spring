package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dib.cinema.entities.Ticket;
@RepositoryRestResource
public interface TicketRipository extends JpaRepository<Ticket,Long> {

}
