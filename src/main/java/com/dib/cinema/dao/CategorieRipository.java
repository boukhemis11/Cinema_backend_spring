package com.dib.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dib.cinema.entities.Categorie;

public interface CategorieRipository extends JpaRepository<Categorie,Long> {

}
