CREATE TABLE IF NOT EXISTS PERSON (
    id int AUTO_INCREMENT NOT NULL PRIMARY KEY,
    first_name varchar(100) NOT NULL,
    last_name varchar(100) NOT NULL,
    email varchar(100),
    street varchar(50),
    street_number varchar(50),
    cip_code varchar(50),
    city varchar(50),
    country varchar(50));

