package com.poligran.ingsoftware.laborexchange.repository;

import com.poligran.ingsoftware.laborexchange.entities.OfferType;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface OfferTypeRepository extends ReactiveCrudRepository<OfferType, Integer> {

    Mono<OfferType> findById(int id);
    Flux<OfferType> findAll();
}
