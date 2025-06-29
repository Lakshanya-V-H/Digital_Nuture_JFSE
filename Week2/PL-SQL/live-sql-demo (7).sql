CREATE TABLE Customers2 (
  CustomerID NUMBER PRIMARY KEY,
  Name VARCHAR2(100),
  AccountType VARCHAR2(20),  -- e.g., 'Savings', 'Current'
  Balance NUMBER(10, 2),
  InterestRate NUMBER(5,2)
);

CREATE TABLE Employees (
  EmployeeID NUMBER PRIMARY KEY,
  Name VARCHAR2(100),
  Department VARCHAR2(50),
  Salary NUMBER(10,2)
);

INSERT INTO Customers2 VALUES (1, 'Arjun', 'Savings', 10000.00, 1.0);
INSERT INTO Customers2 VALUES (2, 'Pranav', 'Current', 5000.00, 1.0);
INSERT INTO Customers2 VALUES (3, 'Arun', 'Savings', 20000.00, 1.0);
INSERT INTO Customers2 VALUES (4, 'Malini', 'Savings', 8000.00, 1.0);
INSERT INTO Customers2 VALUES (5, 'Priya', 'Current', 12000.00, 1.0);

INSERT INTO Employees VALUES (101, 'Jagan', 'IT', 60000);
INSERT INTO Employees VALUES (102, 'Saran', 'HR', 55000);
INSERT INTO Employees VALUES (103, 'Manoj', 'Finance', 70000);
INSERT INTO Employees VALUES (104, 'Naren', 'IT', 62000);
INSERT INTO Employees VALUES (105, 'Lingesh', 'Finance', 68000);

COMMIT;

Select * from CUSTOMERS2;
SELECT * from EMPLOYEES;