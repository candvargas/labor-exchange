package com.poligran.ingsoftware.laborexchange.services;

import com.poligran.ingsoftware.laborexchange.entities.ContractType;
import com.poligran.ingsoftware.laborexchange.repository.ContractTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ContractTypeService {
    @Autowired
    ContractTypeRepository contractTypeRepository;

    public Flux<ContractType> findAll() {
        return contractTypeRepository.findAll();
    }

    public Mono<ContractType> findById(int id) {
        return contractTypeRepository.findById(id);
    }
}
