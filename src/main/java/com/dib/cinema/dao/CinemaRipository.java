package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dib.cinema.entities.Cinema;

public interface CinemaRipository extends JpaRepository<Cinema,Long> {

}
