package com.insomdev.repository;

import java.util.List;

import com.insomdev.models.Weapon;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

@RepositoryRestResource(collectionResourceRel="weapons", path="weapons")
public interface WeaponRepository extends MongoRepository<Weapon, String> {
	public Weapon findByWeaponName(@Param("weaponName") String weaponName);
}