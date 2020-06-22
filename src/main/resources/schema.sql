DROP TABLE IF EXISTS CLIENTS;

CREATE TABLE CLIENTS (
                       client_id UUID PRIMARY KEY,
                       first_name VARCHAR(250) ,
                       last_name VARCHAR(250) ,
                       adress VARCHAR(250),
                       phone_id UUID,
                       email VARCHAR(250),
                       password VARCHAR(250)
);
CREATE TABLE PHONES
(
phone_id UUID PRIMARY KEY,
operator VARCHAR(250),
counts VARCHAR(250)
);

