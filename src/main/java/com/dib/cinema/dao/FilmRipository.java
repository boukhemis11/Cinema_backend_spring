package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dib.cinema.entities.Film;
@RepositoryRestResource
public interface FilmRipository extends JpaRepository<Film,Long> {

}
