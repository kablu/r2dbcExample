package com.nbenja.spring.r2dbcpostgresqlexample.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.nbenja.spring.r2dbcpostgresqlexample.domain.Category;

@Repository
public interface CategoryRepository extends ReactiveCrudRepository<Category, Integer> {
}
