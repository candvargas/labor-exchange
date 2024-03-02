package com.poligran.ingsoftware.laborexchange.repository;

import com.poligran.ingsoftware.laborexchange.entities.ContractType;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractTypeRepository extends ReactiveCrudRepository<ContractType, Integer> {
}
