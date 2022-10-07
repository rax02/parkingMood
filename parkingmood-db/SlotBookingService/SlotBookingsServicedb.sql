DROP TABLE IF EXISTS public."BookingDetail";

CREATE TABLE public."BookingDetail"
(
    id character varying NOT NULL,
    "customerId" integer,
    "parkingSpaceId" integer,
    "parkingLotId" integer NOT NULL,
    "startDateTime" timestamp with time zone NOT NULL,
    "endDateTime" timestamp with time zone,
	"paymentMethod" character varying,
	"bookingStatus" character varying,
    "paymentId" integer,
	"created_at" TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public."BookingDetail"
    OWNER to postgres;
	
	
insert into public."BookingDetail" (id,"customerId","parkingSpaceId","parkingLotId","startDateTime","endDateTime","paymentMethod","bookingStatus","paymentId") 
values('8aacf8265-96a7-4567-b3b1-f77f0602b0d5',1,1,1,'2011-01-01 00:00:00','2011-01-02 00:00:00','paypal','BOOKED',1);