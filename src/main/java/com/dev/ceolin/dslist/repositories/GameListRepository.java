package com.dev.ceolin.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.ceolin.dslist.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long> {

}
