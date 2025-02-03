-- Normalization
-- Normalization is the process of organizing the data and the attributes of a database. it is performed to reduce the data redundancy.

-- 1NF: A relation is in 1NF if all its attributes have an atomic value.

-- 2NF: A relation is in 2NF if it is in 1NF and all non-key attributes are fully functionaly dependent on the candidate key.

-- 3NF: A relation is in 3NF if it is in 2NF and there is no transitive dependency.

-- BCNF: A relation is in BCNF if it is in 3NF and for every functional dependency, the left-hand side of the dependency is a super key.

-- Multiplicity defines the relationship between two tables

-- One to Many Relationship
-- Many to One Relationship
-- Many to Many Relationship
-- One to One Relationship

-- Data modeling is a process for developing the data model for storing information within a database, used in practice for evaluating the data objects and their relationships to other entities used to investigate the business' data requirements for processes

-- Relation Data Model is only one of a few different types, but the one we focus on for SQL
-- Entity Relationship Diagram (ERD) is a graphical representation depicting the relationships among data objects within a database for entities with relationships such as people, objects or concepts.

-- ERD can be generated with third party applications
-- Simple ERD can be generated through your database IDE