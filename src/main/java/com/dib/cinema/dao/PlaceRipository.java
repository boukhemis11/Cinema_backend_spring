package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dib.cinema.entities.Place;

public interface PlaceRipository extends JpaRepository<Place,Long> {

}
