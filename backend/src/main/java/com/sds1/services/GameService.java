package com.sds1.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sds1.dto.GameDTO;
import com.sds1.entities.Game;
import com.sds1.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly=true)
	public List<GameDTO> findAll(){
		List<Game> list = repository.findAll();
		return list.stream().map(obj -> new GameDTO(obj)).collect(Collectors.toList());
	}
}
