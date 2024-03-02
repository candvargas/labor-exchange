package com.poligran.ingsoftware.laborexchange.rest;


import com.poligran.ingsoftware.laborexchange.entities.City;
import com.poligran.ingsoftware.laborexchange.services.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/city")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Flux<City> getAllCities() {
            return cityService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<City> getCityById(@PathVariable("id") int id) {
        return cityService.findById(id);
    }
}
