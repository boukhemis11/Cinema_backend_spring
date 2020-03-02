package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dib.cinema.entities.Salle;
@RepositoryRestResource
public interface SalleRipository extends JpaRepository<Salle,Long> {

}
