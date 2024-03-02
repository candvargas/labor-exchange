package com.poligran.ingsoftware.laborexchange.services;

import com.poligran.ingsoftware.laborexchange.entities.VWFullOffers;
import com.poligran.ingsoftware.laborexchange.repository.ContractTypeRepository;
import com.poligran.ingsoftware.laborexchange.repository.OfferRepository;
import com.poligran.ingsoftware.laborexchange.repository.OfferTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OfferService {
    private final OfferRepository offerRepository;
    private final ContractTypeRepository contractTypeRepository;
    private final OfferTypeRepository offerTypeRepository;


    public Flux<VWFullOffers> findAll() {
        return offerRepository.findAll();
    }

    public Mono<VWFullOffers> findById(int id) {
        return offerRepository.findById(id);
    }

    public Mono<VWFullOffers> getOfferById(Long id) {
        return offerRepository.findById(id);
    }
}
