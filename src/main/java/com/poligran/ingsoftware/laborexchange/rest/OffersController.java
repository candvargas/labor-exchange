package com.poligran.ingsoftware.laborexchange.rest;

import com.poligran.ingsoftware.laborexchange.entities.VWFullOffers;
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

    @GetMapping("/")
    public Flux<VWFullOffers> getAllOffers() {
        return offerService.findAll().log();
    }

    @GetMapping("/{id}")
    public Mono<VWFullOffers> getOfferFindById(@PathVariable("id") Long id){
        return offerService.getOfferById(id);
    }
}
