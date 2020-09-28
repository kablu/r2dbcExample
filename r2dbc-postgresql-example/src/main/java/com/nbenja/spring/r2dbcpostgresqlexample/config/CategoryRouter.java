package com.nbenja.spring.r2dbcpostgresqlexample.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.nbenja.spring.r2dbcpostgresqlexample.domain.Category;
import com.nbenja.spring.r2dbcpostgresqlexample.repository.CategoryRepository;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Configuration
public class CategoryRouter {

   
}