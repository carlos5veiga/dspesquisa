package com.sds1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sds1.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
