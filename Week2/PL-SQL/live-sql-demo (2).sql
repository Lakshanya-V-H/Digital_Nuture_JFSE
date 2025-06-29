BEGIN
  FOR rec IN (
    SELECT CustomerID
    FROM Customers
    WHERE Balance > 10000
  ) LOOP
    UPDATE Customers
    SET IsVIP = 'Y'
    WHERE CustomerID = rec.CustomerID;
  END LOOP;

  COMMIT;
END;
/

SELECT * FROM CUSTOMERS;