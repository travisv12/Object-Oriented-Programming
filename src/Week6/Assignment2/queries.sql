-- Retrieve all the currencies from the database
SELECT * FROM Currency;

-- Retrieve the currency with the abbreviation EUR
SELECT * FROM Currency WHERE abbreviation = 'EUR';

-- Retrieve the number of currencies in the database
SELECT COUNT(*) FROM Currency;

-- Retrieve the currency with the highest exchange rate
SELECT * FROM Currency ORDER BY conversion_rate_to_usd DESC LIMIT 1;