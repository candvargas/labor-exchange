package com.poligran.ingsoftware.laborexchange.services;

import com.poligran.ingsoftware.laborexchange.entities.Offer;
import com.poligran.ingsoftware.laborexchange.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class OfferService {
    @Autowired
    OfferRepository offerRepository;

    public Flux<Offer> findAll() {
        return offerRepository.findAll();
    }

    public Mono<Offer> findById(int id) {
        return offerRepository.findById(id);
    }

    public Flux<Offer> findByName(String name) {
        return offerRepository.findByName(name);
    }
}
