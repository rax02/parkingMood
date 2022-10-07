CREATE TABLE IF NOT EXISTS public.spaceprovider
(
    provideruserid integer NOT NULL,
    price integer NOT NULL,
    slotnumber integer NOT NULL,
    vehicletype character varying(200) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT spaceprovider_pkey PRIMARY KEY (provideruserid, slotnumber)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.spaceprovider
    OWNER to postgres;