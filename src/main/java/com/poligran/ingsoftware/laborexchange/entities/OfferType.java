package com.poligran.ingsoftware.laborexchange.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table("offers_types")
public class OfferType {
    @Id
    private int id;

    private String name;
}
