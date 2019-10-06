package com.coding.WaterBnB.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.coding.WaterBnB.models.Pool;

public interface PoolRepository extends CrudRepository<Pool, Long>{
	List<Pool> findAll();
}