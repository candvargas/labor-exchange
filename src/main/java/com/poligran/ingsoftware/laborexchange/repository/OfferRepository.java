package com.poligran.ingsoftware.laborexchange.repository;

import com.poligran.ingsoftware.laborexchange.entities.VWFullOffers;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface OfferRepository extends ReactiveCrudRepository<VWFullOffers, Integer> {
    @Query("SELECT * FROM vw_full_offers;")
    Flux<VWFullOffers> findAll();
    @Query("SELECT * FROM vw_full_offers WHERE id = :id;")
    Mono<VWFullOffers> findById(Long id);
}
