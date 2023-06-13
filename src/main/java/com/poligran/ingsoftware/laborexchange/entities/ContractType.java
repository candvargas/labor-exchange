package com.poligran.ingsoftware.laborexchange.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("contracts_types")
public class ContractType {
    @Id
    private int id;

    private String name;
}
