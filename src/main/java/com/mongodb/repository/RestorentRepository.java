package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.entity.Restorent;

public interface RestorentRepository extends MongoRepository<Restorent,Integer> {

}
