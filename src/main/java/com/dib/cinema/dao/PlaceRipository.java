package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dib.cinema.entities.Place;
@RepositoryRestResource
public interface PlaceRipository extends JpaRepository<Place,Long> {

}
