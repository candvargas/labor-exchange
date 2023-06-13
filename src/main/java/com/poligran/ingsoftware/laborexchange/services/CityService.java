package com.poligran.ingsoftware.laborexchange.services;

import com.poligran.ingsoftware.laborexchange.entities.City;
import com.poligran.ingsoftware.laborexchange.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public Flux<City> findAll() {
        return cityRepository.findAll();
    }

    public Mono<City> findById(int id) {
        return cityRepository.findById(id);
    }
}
