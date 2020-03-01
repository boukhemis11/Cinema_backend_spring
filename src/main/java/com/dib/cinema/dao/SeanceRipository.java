package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dib.cinema.entities.Seance;

public interface SeanceRipository extends JpaRepository<Seance,Long> {

}
