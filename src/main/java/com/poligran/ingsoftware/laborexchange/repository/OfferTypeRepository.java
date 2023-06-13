package com.poligran.ingsoftware.laborexchange.repository;

import com.poligran.ingsoftware.laborexchange.entities.OfferType;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferTypeRepository extends ReactiveCrudRepository<OfferType, Integer> {
}
