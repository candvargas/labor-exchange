package com.poligran.ingsoftware.laborexchange.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table("offers")
public class Offer {
    @Id
    private int id;

    private String name;

    private String description;

    @Column("city_id")
    private City city;

    private int salary;

    @Column("offer_type")
    private OfferType offerType;

    @Column("contract_type")
    private ContractType contractType;
}
