package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dib.cinema.entities.Film;

public interface FilmRipository extends JpaRepository<Film,Long> {

}
