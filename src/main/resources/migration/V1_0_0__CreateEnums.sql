CREATE TYPE brand AS ENUM (
    'BRAND_1',
    'BRAND_2',
    'BRAND_3',
    'BRAND_4'
    );

CREATE SEQUENCE public.person_sq INCREMENT 1 START WITH 1 MINVALUE 1;

CREATE TABLE person
(
    id                   BIGINT,
    name                 varchar              NOT NULL
    brand                brand                NOT NULL,
    brands               brand[]              NOT NULL,
    PRIMARY KEY (id)
);
