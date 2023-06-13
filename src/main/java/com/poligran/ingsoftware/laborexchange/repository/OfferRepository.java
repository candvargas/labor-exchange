package com.poligran.ingsoftware.laborexchange.repository;

import com.poligran.ingsoftware.laborexchange.entities.Offer;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface OfferRepository extends ReactiveCrudRepository<Offer, Integer> {
    @Query("SELECT o.*, c.name, c.id AS city_id, c.name AS city_name\n" +
            "FROM \"labor-exchange\".offers o\n" +
            "LEFT JOIN \"labor-exchange\".cities c on o.city_id=c.id;")
    Flux<Offer> findAll();
    Mono<Offer> findById(int id);
    @Query("select * from offers o where name like :name")
    Flux<Offer> findByName(String name);
}
