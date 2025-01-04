-- How to CREATE schema
CREATE schema fruits_and_veggies;

-- How to USE schema
USE fruits_and_veggies;

-- How to CREATE TABLE
CREATE TABLE IF NOT EXISTS produce ( 
    id INT AUTO_INCREMENT PRIMARY KEY, 
    name VARCHAR(20) NOT NULL UNIQUE, 
    price D/ECIMAL(3,2), 
    type VARCHAR(10) NOT NULL
);

-- How to DROP TABLE(delete the entire table from the database.)
DROP TABLE produce;

-- How to TRUNCATE TABLE(delete the rows/contents of the table)
TRUNCATE TABLE produce;

-- How to INSERT into the TABLE with contents.
INSERT INTO produce (name, price, type) 
VALUES ('navel orange', 1.99, 'citrus'), 
('mandarin orange', 0.75, 'citrus'), 
('tangerine', 0.50, 'citrus'), 
('red delicious', 2.00, 'apple'),
('jona gold', 2.50, 'apple'), 
('granny smith', 1.00, 'apple'), 
('blueberry', 0.40, 'berry'), 
('raspberry', 0.35, 'berry'), 
('kiwi', 0.75, 'berry');

-- How to UPDATE table
UPDATE produce 
SET name = 'orange'
WHERE name = 'navel orange';-- this will update the name to orange where all names are navel orange

-- How to UPDATE specific rows
UPDATE produce 
SET price = 2.00
WHERE row = 1;

-- How to DELETE contents from a TABLE
DELETE FROM produce  
WHERE name = 'tangerine'; --this will delete ALL rows with id of 3;

-- How use SELECT to show everything in the title and artist column
SELECT name, price, type FROM produce;
SELECT price FROM produce;

--How to use AND/OR
SELECT name FROM produce 
WHERE type='apple' AND price>1.00; --returns ones with apple and price higher than 1.00

-- How to use NOT
SELECT nameFROM produce 
WHERE NOT (type='apple') AND NOT (type='allium');

-- How to use IN (select everything with apple and root)
SELECT name, price, type FROM produce 
WHERE type IN ('apple', 'root');

-- How to use LIKE (find rows with names starting with 'j')
SELECT name FROM produce 
WHERE name LIKE 'j%'; -- jona gold

-- How to use LIKE to find a type with 5 characters?
SELECT name FROM produce 
WHERE type LIKE '_____';

-- How to use BETWEEN 
SELECT name FROM produce 
WHERE price BETWEEN 0.50 and 1.00;

-- BETWEEN works with letters
SELECT name FROM produce 
WHERE name BETWEEN 'o' AND 'y';

-- How to use GROUP BY
SELECT type, AVG(price) 
FROM produce GROUP BY type; -- groups all fruit with the same type returns the avg price of each fruit type

-- SELECT name, price, type FROM produce ORDER BY name ASC;
SELECT name FROM produce 
ORDER BY name ASC;

--  ORDER BY DESCENDING DESC
SELECT name FROM produce 
ORDER BY name DESC;

-- Select the first 5 produce records after ordering alphabetically.
SELECT name FROM produce 
ORDER BY name ASC LIMIT 5;

-- Select the second 5 produce records after ordering alphabetically using OFFSET
SELECT name FROM produce 
ORDER BY name ASC LIMIT 5 OFFSET 5;

-- How to ALTER the TABLE so that 
ALTER TABLE produce ADD pounds INT;