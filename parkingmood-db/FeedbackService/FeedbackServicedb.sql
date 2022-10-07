CREATE TABLE IF NOT EXISTS public.feedbacks
(
    feedbackid integer NOT NULL,
    name character varying(228) COLLATE pg_catalog."default" NOT NULL,
    customerid integer NOT NULL,
    bookingid character varying COLLATE pg_catalog."default" NOT NULL,
    rating integer NOT NULL,
    writereview character varying(990) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT feedbacks_feedbackid_key UNIQUE (feedbackid)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.feedbacks
    OWNER to postgres;