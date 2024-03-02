package com.poligran.ingsoftware.laborexchange.repository;

import com.poligran.ingsoftware.laborexchange.entities.City;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CityRepository extends ReactiveCrudRepository<City, Integer> {
    Mono<City> findById(int id);

    Flux<City> findAll();
}
