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
