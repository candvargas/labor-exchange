CREATE SCHEMA "labor-exchange" AUTHORIZATION postgres;

CREATE TABLE "labor-exchange".department (
	id serial2 NOT NULL,
	"name" varchar NULL,
	CONSTRAINT department_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".cities (
	id serial4 NOT NULL,
	"name" varchar NOT NULL,
	department_id varchar NULL,
	CONSTRAINT cities_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".offers_types (
	id serial NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT types_offers_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".contracts_types (
	id serial2 NOT NULL,
	"name" varchar NOT NULL,
	CONSTRAINT types_contracts_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".offers (
	id serial8 NOT NULL,
	"name" varchar NOT NULL,
	description text NOT NULL,
	city_id int4 NULL,
	salary int4 NULL,
    offer_type int2 NULL,
    contract_type int2 NULL,
	created_at date NOT NULL DEFAULT current_date,
	CONSTRAINT offers_pk PRIMARY KEY (id)
);

CREATE TABLE "labor-exchange".requirements (
	id serial NOT NULL,
	offer_id int8 NOT NULL,
	education_id int2 NULL,
	years_of_experience int2 NULL,
	additional_description text NULL
);


INSERT INTO "labor-exchange".offers ("name", description, city_id) VALUES('liniero', 'debe hechar lineas', 1, 1300000,
1, 1);
INSERT INTO "labor-exchange".offers ("name", description, city_id) VALUES('excavador', 'debe hechar lineas', 1, 1500000,
 1, 1);
