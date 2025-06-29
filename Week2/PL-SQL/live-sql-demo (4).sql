CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR rec IN (
    SELECT CustomerID, Balance
    FROM Customers2
    WHERE AccountType = 'Savings'
  ) LOOP
    UPDATE Customers2
    SET Balance = Balance + (Balance * 0.01)
    WHERE CustomerID = rec.CustomerID;
  END LOOP;

  COMMIT;
END;
/
EXECUTE ProcessMonthlyInterest;

SELECT * FROM CUSTOMERS2;