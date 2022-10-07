CREATE TABLE public."ProviderDetails" (
    "fullName" character varying(50),
    username character varying(20) NOT NULL,
    "userId" integer NOT NULL,
    password character varying(20) NOT NULL,
    email_id character varying(50) NOT NULL,
    address character varying(100)
);


ALTER TABLE public."ProviderDetails" ALTER COLUMN "userId" ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."ProviderDetails_userId_seq"
    START WITH 100
    INCREMENT BY 1
    MINVALUE 100
    MAXVALUE 5000
    CACHE 1
);

ALTER TABLE ONLY public."ProviderDetails"
    ADD CONSTRAINT "ProviderDetails_email_id_key" UNIQUE (email_id);


ALTER TABLE ONLY public."ProviderDetails"
    ADD CONSTRAINT "ProviderDetails_pkey" PRIMARY KEY (username);


ALTER TABLE ONLY public."ProviderDetails"
    ADD CONSTRAINT "ProviderDetails_userId_key" UNIQUE ("userId");

INSERT INTO public."ProviderDetails" ("fullName", username, "userId", password, email_id, address) OVERRIDING SYSTEM VALUE VALUES ('ProviderB', 'prvdrA01', 104, 'passwordA', 'provider.a@parkingmood.com', 'addressA');

CREATE TABLE public."CustomerDetails" (
    "fullName" name,
    username character varying(20) NOT NULL,
    user_id integer NOT NULL,
    email_id character varying(50) NOT NULL,
    password character varying(20),
    phone_number integer
);


ALTER TABLE public."CustomerDetails" ALTER COLUMN user_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."CustomerDetails_user_id_seq"
    START WITH 200
    INCREMENT BY 1
    MINVALUE 200
    MAXVALUE 5000
    CACHE 1
);


ALTER TABLE ONLY public."CustomerDetails"
    ADD CONSTRAINT "CustomerDetails_email_id_key" UNIQUE (email_id);


ALTER TABLE ONLY public."CustomerDetails"
    ADD CONSTRAINT "CustomerDetails_pkey" PRIMARY KEY (username, user_id);

