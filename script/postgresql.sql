-- Postgresql 9.6

CREATE SEQUENCE public.persona_seq
INCREMENT 1
START 1
MINVALUE 1
MAXVALUE 9223372036854775807
CACHE 1;

ALTER SEQUENCE public.persona_seq
OWNER TO postgres;

-- Table: public.employee

-- DROP TABLE public.employee;

CREATE TABLE public.persona
(
  persona_id integer NOT NULL DEFAULT nextval('persona_seq'::regclass),
  nombre character varying(28) COLLATE pg_catalog."default" NOT NULL,
  apellido character varying(28) COLLATE pg_catalog."default" NOT NULL,
  dni character varying(28) COLLATE pg_catalog."default" NOT NULL,
  email character varying(28) COLLATE pg_catalog."default" NOT NULL,
  telefono character varying(28) COLLATE pg_catalog."default" NOT NULL,
  CONSTRAINT persona_pkey PRIMARY KEY (persona_id)
)
WITH (
OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.persona
  OWNER to postgres;