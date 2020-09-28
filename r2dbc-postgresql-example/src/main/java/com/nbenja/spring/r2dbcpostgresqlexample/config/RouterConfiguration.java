package com.nbenja.spring.r2dbcpostgresqlexample.config;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import org.springframework.beans.factory.annotation.Autowired;

import com.nbenja.spring.r2dbcpostgresqlexample.api.UserHandler;
import com.nbenja.spring.r2dbcpostgresqlexample.domain.Category;
import com.nbenja.spring.r2dbcpostgresqlexample.repository.CategoryRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class RouterConfiguration {

	
	@Bean
	public RouterFunction<ServerResponse> routerFunction(UserHandler userHandler) {
		return route().POST("/users", userHandler::createUser).
				GET("/users", userHandler::getUsers)
				.GET("/users/{id}", userHandler::getUser).build();
	}
	 
  
  @Autowired
  public CategoryRepository categoryRepository;

  @Bean
  public RouterFunction<ServerResponse> getAllCategoriesRoute() {
      return route(GET("/category"),
              req ->
                      ok().body(
                              categoryRepository.findAll(), Category.class)
      );
      
     
  }
}
