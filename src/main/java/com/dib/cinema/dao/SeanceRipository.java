package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dib.cinema.entities.Seance;
@RepositoryRestResource
public interface SeanceRipository extends JpaRepository<Seance,Long> {

}
