package com.sds1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sds1.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
