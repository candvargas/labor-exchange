CREATE TABLE IF NOT EXISTS "labor-exchange".cities (
	id serial4 NOT NULL,
	"name" varchar NOT NULL,
	department_id varchar NULL,
	CONSTRAINT cities_pk PRIMARY KEY (id)
);