package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dib.cinema.entities.Salle;

public interface SalleRipository extends JpaRepository<Salle,Long> {

}