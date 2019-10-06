package com.coding.WaterBnB.repositories;

import org.springframework.data.repository.CrudRepository;

import com.coding.WaterBnB.models.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}