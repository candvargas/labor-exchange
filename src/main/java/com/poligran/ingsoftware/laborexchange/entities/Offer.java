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
    private Long id;

    private String name;

    private String description;

    @Column("city_id")
    private Integer city;

    private int salary;

    @Column("offer_type_id")
    private Integer offerType;

    @Column("contract_type_id")
    private Integer contractType;
}
