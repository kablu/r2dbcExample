package com.nbenja.spring.r2dbcpostgresqlexample.repository;

import com.nbenja.spring.r2dbcpostgresqlexample.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Integer> {

}
