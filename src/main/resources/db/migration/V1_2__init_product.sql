 CREATE TABLE owner
 (
     product_id     SERIAL          NOT NULL,
     product_code   INT             NOT NULL,
     type           VARCHAR(32)     NOT NULL,
     name           VARCHAR(32)     NOT NULL,
     description    VARCHAR(32)     NOT NULL,
     price          NUMERIC(19, 2)  NOT NULL,
     PRIMARY KEY (product_id)
 )