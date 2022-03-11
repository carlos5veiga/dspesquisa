package com.sds1.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sds1.dto.RecordDTO;
import com.sds1.entities.Record;
import com.sds1.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Transactional(readOnly=true)
	public List<RecordDTO> findAll(){
		List<Record> list = repository.findAll();
		return list.stream().map(obj -> new RecordDTO(obj)).collect(Collectors.toList());
	}
	
	@Transactional
	public RecordDTO insert(RecordDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}
