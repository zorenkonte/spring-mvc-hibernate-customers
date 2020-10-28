DROP TABLE `customer` IF EXISTS;

CREATE TABLE `customer`
(
    `id`         INTEGER IDENTITY PRIMARY KEY,
    `first_name` VARCHAR(255) NOT NULL,
    `last_name`  VARCHAR(255) NOT NULL,
    `email`      VARCHAR(255) NOT NULL
);
CREATE UNIQUE INDEX `customer_email_uindex` ON `customer` (`email`);