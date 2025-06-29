CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR2(100),
    Age INT,
    Balance NUMBER(10,2),
    InterestRate NUMBER(5,2),
    IsVIP CHAR(1) DEFAULT 'N' -- Use 'Y' or 'N'
);

CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    DueDate DATE,
    ReminderSent CHAR(1) DEFAULT 'N',
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

BEGIN
INSERT INTO Customers (CustomerID, Name, Age, Balance, InterestRate)
VALUES 
(1, 'Archana', 65, 15000.00, 7.5),
(2, 'Babu', 58, 9500.00, 8.0),
(3, 'Saran', 62, 11000.00, 6.8),
(4, 'Dharunika', 45, 5000.00, 7.2),
(5, 'Varshini', 70, 20000.00, 7.9);

INSERT INTO Loans (LoanID, CustomerID, DueDate)
VALUES 
(101, 1, SYSDATE + 10),
(102, 2, SYSDATE + 40),
(103, 3, SYSDATE + 5),
(104, 5, SYSDATE + 25);

COMMIT;
END;
/