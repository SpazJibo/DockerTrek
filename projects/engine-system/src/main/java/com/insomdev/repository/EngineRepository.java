package com.insomdev.repository;

import java.util.List;

import com.insomdev.models.Engine;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

@RepositoryRestResource(collectionResourceRel="weapons", path="weapons")
public interface EngineRepository extends MongoRepository<Engine, String> {
	public Engine findByEngineType(@Param("engineType") String engineType);
}