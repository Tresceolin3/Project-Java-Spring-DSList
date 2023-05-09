package com.dev.ceolin.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.ceolin.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
}
