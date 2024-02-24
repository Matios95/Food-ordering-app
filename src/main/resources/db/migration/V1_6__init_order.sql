CREATE TABLE ordera
(
    ordera_id    SERIAL                      NOT NULL,
    ordera_code  INT                         NOT NULL,
    product_id  INT                         NOT NULL,
    datetime    TIMESTAMP WITH TIME ZONE    NOT NULL,
    PRIMARY KEY (ordera_id),
    UNIQUE(ordera_code),
    CONSTRAINT fk_ordera_product
        FOREIGN KEY (product_id)
            REFERENCES product (product_id)
)