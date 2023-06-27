CREATE SCHEMA "labor-exchange" AUTHORIZATION root;

CREATE TABLE "labor-exchange".department (
    id smallserial NOT NULL,
    "name" varchar NOT NULL,
    CONSTRAINT department_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".cities (
    id serial4 NOT NULL,
    "name" varchar NOT NULL,
    department_id int2 NULL,
    CONSTRAINT cities_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".offers_types (
    id serial4 NOT NULL,
    "name" varchar NOT NULL,
    CONSTRAINT types_offers_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".contracts_types (
    id smallserial NOT NULL,
    "name" varchar NOT NULL,
    CONSTRAINT types_contracts_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".offers (
    id bigserial NOT NULL,
    "name" varchar NOT NULL,
    description text NOT NULL,
    city_id int4 NOT NULL,
    salary int4 NOT NULL,
    offer_type int2 NOT NULL,
    contract_type int2 NOT NULL,
    created_at date NOT NULL DEFAULT CURRENT_DATE,
    active bool NOT NULL DEFAULT true,
    CONSTRAINT offers_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".requirements (
    id serial4 NOT NULL,
    offer_id int8 NOT NULL,
    education_level_id int2 NULL,
    years_of_experience int2 NULL,
    additional_description text NULL,
    CONSTRAINT requirements_pk PRIMARY KEY (id)
);

ALTER TABLE "labor-exchange".cities ADD CONSTRAINT cities_fk FOREIGN KEY (department_id) REFERENCES "labor-exchange".department(id);
ALTER TABLE "labor-exchange".offers ADD CONSTRAINT offers_fk FOREIGN KEY (city_id) REFERENCES "labor-exchange".cities(id);
ALTER TABLE "labor-exchange".offers ADD CONSTRAINT offers_fk_1 FOREIGN KEY (offer_type_id) REFERENCES "labor-exchange".offers_types(id);
ALTER TABLE "labor-exchange".offers ADD CONSTRAINT offers_fk_2 FOREIGN KEY (contract_type_id) REFERENCES "labor-exchange".contracts_types(id);
ALTER TABLE "labor-exchange".requirements ADD CONSTRAINT requirements_fk FOREIGN KEY (offer_id) REFERENCES "labor-exchange".offers(id);
ALTER TABLE "labor-exchange".requirements ADD CONSTRAINT requirements_fk_1 FOREIGN KEY (education_level_id) REFERENCES "labor-exchange".education_level(id);


