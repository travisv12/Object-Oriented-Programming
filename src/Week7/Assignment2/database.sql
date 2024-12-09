-- Drop the previous version of the database, if it exists
DROP DATABASE IF EXISTS currency_converter;

-- Create the database
CREATE DATABASE currency_converter;

-- Use the database
USE currency_converter;

-- Create a table for storing the Currency objects
CREATE TABLE Currency (
                          id INT NOT NULL AUTO_INCREMENT,
                          abbreviation VARCHAR(10) NOT NULL,
                          name VARCHAR(50) NOT NULL,
                          conversion_rate_to_usd DECIMAL(10, 4) NOT NULL,
                          PRIMARY KEY (id)
);

-- Populate the Currency table with data
INSERT INTO Currency (abbreviation, name, conversion_rate_to_usd) VALUES
                                                                      ('USD', 'US Dollar', 1.0000),
                                                                      ('EUR', 'Euro', 0.8500),
                                                                      ('GBP', 'British Pound', 0.7500),
                                                                      ('JPY', 'Japanese Yen', 110.0000),
                                                                      ('AUD', 'Australian Dollar', 1.3000),
                                                                      ('CAD', 'Canadian Dollar', 1.2500),
                                                                      ('CHF', 'Swiss Franc', 0.9200),
                                                                      ('CNY', 'Chinese Yuan', 6.4500);

-- Create a table for storing the Transaction objects
CREATE TABLE Transaction (
                             id INT NOT NULL AUTO_INCREMENT,
                             amount DECIMAL(10, 2) NOT NULL,
                             source_currency_id INT NOT NULL,
                             target_currency_id INT NOT NULL,
                             PRIMARY KEY (id),
                             FOREIGN KEY (source_currency_id) REFERENCES Currency(id) ON DELETE CASCADE ON UPDATE CASCADE,
                             FOREIGN KEY (target_currency_id) REFERENCES Currency(id) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Drop the user account appuser, if it exists
DROP USER IF EXISTS 'appuser'@'localhost';

-- Create the user account appuser
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';

-- Grant the necessary privileges to the user account appuser
GRANT SELECT, INSERT, UPDATE, DELETE ON currency_converter.* TO 'appuser'@'localhost';
