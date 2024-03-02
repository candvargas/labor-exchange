package com.poligran.ingsoftware.laborexchange.rest;

import com.poligran.ingsoftware.laborexchange.entities.ContractType;
import com.poligran.ingsoftware.laborexchange.services.ContractTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/contract_type")
public class ContractTypeController {
    @Autowired
    ContractTypeService contractTypeService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public Flux<ContractType> getAllCities() {
            return contractTypeService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<ContractType> getCityById(@PathVariable("id") int id) {
        return contractTypeService.findById(id);
    }
}
