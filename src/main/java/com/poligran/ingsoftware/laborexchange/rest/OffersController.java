package com.poligran.ingsoftware.laborexchange.rest;

import com.poligran.ingsoftware.laborexchange.entities.Offer;
import com.poligran.ingsoftware.laborexchange.repository.OfferRepository;
import com.poligran.ingsoftware.laborexchange.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/offers")
public class OffersController {

    @Autowired
    private OfferService offerService;

    @GetMapping("")
    public Flux<Offer> getAllOffers() {
        return offerService.findAll().log();
    }

    @GetMapping("/{id}")
    public Mono<Offer> getOfferFindById(@PathVariable("id") int id){
        return offerService.findById(id);
    }

    @GetMapping("/{name}")
    public Flux<Offer> getOfferFindByName(@RequestBody Offer offer) {
        return offerService.findByName(offer.getName());
    }
}
