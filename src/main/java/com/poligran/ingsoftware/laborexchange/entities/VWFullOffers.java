package com.poligran.ingsoftware.laborexchange.entities;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("vw_full_offers")
public class VWFullOffers {
    private Long id;

    private String name;

    private String description;

    @Column("city_id")
    private Integer cityId;

    @Column("city_name")
    private String cityName;

    private int salary;

    @Column("offer_type_id")
    private Integer offerTypeId;

    @Column("offer_type_name")
    private String offerTypeName;

    @Column("contract_type_id")
    private Integer contractTypeId;

    @Column("contract_type_name")
    private String contractTypeName;
}
