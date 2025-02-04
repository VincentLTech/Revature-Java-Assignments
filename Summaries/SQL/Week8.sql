-- DCL/Privileges
-- How to give privileges to other users using GRANT/REVOKE

GRANT SELECT,  INSERT, UPDATE, DELETE ON posts TO 'community.manager';
REVOKE SELECT, INSERT, UPDATE, DELETE ON posts FROM 'community.manager';

-- Privilege	Description
-- INDEX	    allows creating indexes on tables
-- CREATE	    allows CREATE table statements
-- ALTER	    allows ALTER table statements
-- DROP	        allows DROP table statements
-- ALL	        allow all permissions except GRANT
-- GRANT	    allows GRANT statements

-- TCL/Transactions
-- How to use transactions using START TRANSACTION/COMMIT/ROLLBACK

-- Consider an example of a transaction where you tried to add a new bank account ACC3 and set the funds to 10000. 
-- In that same transaction, you tried to create another account, ACC4, and set its funds to 900000 when it was supposed to be 9000. 
-- If the entire transaction is rolled back, the step of creating ACC3 with 10000 initial funds would also be rolled back. 
-- To avoid this, a save point can be added soon after creating ACC3 and we can roll back to before the statement of that creates account ACC4.

START TRANSACTION;
INSERT INTO bankaccounts VALUES("ACC3", 10000);
SAVEPOINT sv;
INSERT INTO bankaccounts VALUES("ACC4", 900000);
ROLLBACK TO sv;
INSERT INTO bankaccounts VALUES("ACC4", 90000);
COMMIT;


-- Step 1: Create Table bankaccount with columns account_no and funds.
CREATE TABLE bankaccounts(
    account_no varchar(20) PRIMARY KEY NOT NULL,
    funds decimal(8,2)
);

-- Step 2: Add two accounts named ACC1 and ACC2 with an initial fund balance of $1000 each.
INSERT INTO bankaccounts VALUES("ACC1", 1000);
INSERT INTO bankaccounts VALUES("ACC2", 1000);

-- Step 3: Now, let’s see the transaction of transfering 100$ from ACC1 to ACC2.
START TRANSACTION or BEGIN; 
UPDATE bankaccounts SET funds=funds-100 WHERE account_no='ACC1';
UPDATE bankaccounts SET funds=funds+100 WHERE account_no='ACC2';
COMMIT; 

-- BEGIN or START TRANSACTION: Starts a new transaction.
-- COMMIT: Commits/saves the changes of a successful transaction.
-- SAVEPOINT: Sets a point within a transaction to which you can later rollback if needed, without rolling back the entire transaction.
-- ROLLBACK: Used to undo the changes done by the transaction.



-- How to find the average, total rows, sum, smallest and largest of a set.Aggregate Function
SELECT SUM(duration) AS "Total duration" FROM EMP;

-- Aggregate Function	Descriptions
-- count()	Returns the number of rows, including rows with NULL values in a group.
-- sum()	Returns the total summed values in a set.
-- avg()	Returns the average value of an expression.
-- min()	Returns the minimum (lowest) value in a set.
-- max()	Returns the maximum (highest) value in a set.

-- Scalar Functions
Converting a string to uppercase:
SELECT UCASE ("Hello World") AS UpperCase_String;  -- HELLO WORLD

-- Converting a string into lowercase:
SELECT LCASE ("Hello World") AS LowerCase_String;  -- hello world

-- Selecting a substring of a string:
SELECT MID ("Hello World", 4, 8) AS Substring;-- lo World

-- Selecting the length of a string:
SELECT LENGTH ("Hello World") AS String_Length;-- 11

-- Rounding a numeric value to the number of decimals specified:
SELECT ROUND (1560.44444, 2) AS Round_Value; -- 1560.44

-- Selecting the current day and time:
SELECT NOW () AS CurrentDateTime;  -- 2022-07-17 08:44:36

-- Formatting a numeric value:
SELECT FORMAT (1234.1234, 2) AS Format_Number;  -- 1234.12

-- What is a sequence?
-- It is a list of integers produced in an ascending order.

-- sequence_name: Name of the sequence.
-- START WITH: Starting value from where the sequence starts.
-- INCREMENT BY: Value by which sequence will increment itself. Increment_value can be positive or negative.
-- MAXVALUE: Maximum value of the sequence.
-- MINVALUE: Minimum value of the sequence.
-- CYCLE: When sequence reaches its set_limit it starts from beginning.
-- NOCYCLE: An exception will be thrown if the sequence exceeds its max_value.


CREATE SEQUENCE example_1
AS INT
START WITH 10
INCREMENT BY 10; 

CREATE SEQUENCE example_2
start with 100
increment by -1
minvalue 1
maxvalue 100
cycle;

-- What is a trigger? 
-- It is a named SQL unit that is stored in the database and runs in response to an event that occurs in the database

-- AFTER INSERT activated after data is inserted into the table.
-- AFTER UPDATE: activated after data in the table is modified.
-- AFTER DELETE: activated after data is deleted/removed from the table.
-- BEFORE INSERT: activated before data is inserted into the table.
-- BEFORE UPDATE: activated before data in the table is modified.
-- BEFORE DELETE: activated before data is deleted/removed from the table.

create trigger student_grade 
before INSERT 
on 
Student 
for each row 
set Student.total = Student.subj1 + Student.subj2 + Student.subj3, 
Student.perc = Student.total * 50 / 100;
Syntax to delete a trigger

DROP TRIGGER [IF EXISTS] trigger_name