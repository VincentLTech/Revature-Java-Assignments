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


-- Basic SQL JOIN Clause syntax, using INNER JOIN to show basic syntax.

-- Table: Users
-- userid	username	    email
-- 1	    LolipopMagee	Sarah.Magee@example.com
-- 2	    ToBeOrNotToBe	harry.smith@example.com
-- 3	    JingleTrees	    bob.johnson@example.com

-- Table: Account
-- accountid	userid	accountnumber	balance
-- 101	        1	    A123456	        1000.00
-- 102	        2	    B789012	        2500.50

SELECT 
Users.UserID, 
Users.UserName, 
Users.Email, 
Account.AccountNumber, 
Account.Balance  
FROM Users INNER JOIN Account 
ON Users.UserID = Account.UserID;  

-- this returns only the first two of each tables becayse their userid in ON clause are the same and only 1 and 2 exist and not 3.

-- userid	username	    email	                accountnumber	balance
-- 1	    LolipopMagee	Sarah.Magee@example.com	A123456	        1000.00
-- 2	    ToBeOrNotToBe	harry.smith@example.com	B789012	        2500.50




-- LEFT JOIN will show all of the left table while adding additional rows from the right table that has the same of ON. 
-- So since customer id of 4 is not in customer, it wont show. but since there are two customerid with 1 and left table has 1, both will show in different rows.

-- Table: Customers
-- customerid	name	    country
-- 1	        John	        USA
-- 2	        Jane	        Canada
-- 3	        Bob	            UK

-- Table: Orders
-- orderid	customerid	orderdate	totalamount
-- 101	    1	        2023-01-15	500.00
-- 102	    2	        2023-02-10	750.25
-- 103	    1	        2023-03-05	200.50
-- 104	    4	        2023-04-20	300.75

SELECT 
Customers.customerid, 
Customers.name, 
Orders.orderid, 
Orders.OrderDate, 
Orders.TotalAmount
FROM Customers LEFT JOIN Orders 
ON Customers.customerid = Orders.customerid;

-- this returns all records from Customers table and all records from Orders table.

-- customerid   name            orderid        orderdate	totalamount
-- 1            John            101            2023-01-15	500.00
-- 2            Jane            102            2023-02-10	750.25
-- 1            John            103            2023-01-15	500.00
-- 3            Bob             NULL           NULL         NULL     --because bob didnt order anything, it will be NULL


SELECT 
Customers.CustomerID, 
Customers.Name,  
Customers.Country, 
Orders.OrderID, 
Orders.OrderDate, 
Orders.TotalAmount
FROM Customers RIGHT JOIN Orders 
ON Customers.CustomerID = Orders.CustomerID;

-- this returns all records from Customers table and all records from Orders table.

-- customerid	name	country	orderid	    orderdate	totalamount
-- 1	        John	USA	    101	        2023-01-15	500.00
-- 2	        Jane	Canada	102	        2023-02-10	750.25
-- 1	        John	USA	    103	        2023-03-05	200.50
-- NULL	        NULL	NULL	104	        2023-04-20	300.75    
--because bob didnt order anything, it will be NULL


SELECT 
PartyGuests.GuestID, 
PartyAttendees.AttendeeID, 
PartyGuests.GuestName,
PartyAttendees.AttendeeName  
FROM PartyGuests FULL OUTER JOIN PartyAttendees 
ON PartyGuests.GuestID = PartyAttendees.AttendeeID;
