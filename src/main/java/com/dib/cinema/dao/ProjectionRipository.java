package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dib.cinema.entities.Projection;

public interface ProjectionRipository extends JpaRepository<Projection,Long> {

}
