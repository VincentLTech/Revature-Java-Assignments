-- Step 1: Create the tables called employee, client, and branch.
CREATE TABLE employee(
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    manager_id INT,
    FOREIGN KEY(manager_id) REFERENCES employee(employee_id) ON DELETE SET NULL
    );
CREATE TABLE client(
    client_id INT PRIMARY KEY,
    client_name VARCHAR(20),
    branch_id INT,
    FOREIGN KEY(branch_id) REFERENCES branch(branch_id) ON DELETE SET NULL

);
CREATE TABLE branch (
  branch_id INT PRIMARY KEY,
  client_name VARCHAR(40),
  manager_id INT,
  FOREIGN KEY(manager_id) REFERENCES employee(employee_id) ON DELETE SET NULL
);
-- Step 2: Create a table works_with
CREATE TABLE works_with (
  employee_id INT,
  client_id INT,
  sales INT,
  PRIMARY KEY(employee_id, client_id),
  FOREIGN KEY(employee_id) REFERENCES Employee(employee_id) ON DELETE CASCADE,
  FOREIGN KEY(client_id) REFERENCES Client(client_id) ON DELETE CASCADE
);



-- How to return all possible row combinations from each table. Cross Join/CARTESIAN JOIN

-- This will return all possible combinations of customers and products.
-- Notice that each customer will have a row for each product they buy.
-- 3 x 3 = 9
SELECT Customers.CustomerID, Customers.F_Name, Customers.L_Name, 
Products.ProductID, Products.ProductName, Products.Price AS ProductPrice
FROM Customers
CROSS JOIN Products;

Table: Customers
customerid	f_name	l_name
1	        Alice	May
2	        Bob	    Parker
3	        Charlie	Chocolate

Table: Products
productid	productname	price
101	        Laptop	    999.99
102	        Smartphone	499.99
103	        Headphones	79.99

OUTPUT:
customerid	    f_name	    l_name	    productid	productname	productprice
1	            Alice	    May	        101	        Laptop	    999.99
2	            Bob	        Parker	    101	        Laptop	    999.99
3	            Charlie	    Chocolate	101	        Laptop	    999.99
1	            Alice	    May	        102	        Smartphone	499.99
2	            Bob	        Parker	    102	        Smartphone	499.99
3	            Charlie	    Chocolate	102	        Smartphone	499.99
1	            Alice	    May	        103	        Headphones	79.99
2	            Bob	        Parker	    103	        Headphones	79.99
3	            Charlie	    Chocolate	103	        Headphones	79.99


SELECT e.employee_name AS employee, m.employee_name AS manager  
FROM employees e  
JOIN employees m ON e.manager_id = m.employee_id  
ORDER BY e.employee_id;
-- this merges

Table: Employees
employee_id	employee_name	        manager_id
1	        CEO	
2	        Marketing Manager	    1
3	        Sales Manager	        1
4	        Marketing Specialist	2
5	        Sales Representative	3
6	        Marketing Intern	    2

OUTPUT:
employee	            manager
Marketing Manager	    CEO
Sales Manager	        CEO
Marketing Specialist	Marketing Manager
Sales Representative	Sales Manager
Marketing Intern	    Marketing Manager