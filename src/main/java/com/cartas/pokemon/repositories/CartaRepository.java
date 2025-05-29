package com.cartas.pokemon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartas.pokemon.entities.Carta;

@Repository
public interface CartaRepository extends JpaRepository<Carta, Long>{

}
