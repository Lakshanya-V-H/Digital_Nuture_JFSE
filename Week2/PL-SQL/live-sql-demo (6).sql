CREATE OR REPLACE PROCEDURE TransferFunds(
  p_FromCustID IN NUMBER,
  p_ToCustID IN NUMBER,
  p_Amount IN NUMBER
) AS
  v_Balance NUMBER;
BEGIN
  -- Check balance of sender
  SELECT Balance INTO v_Balance
  FROM Customers2
  WHERE CustomerID = p_FromCustID;

  IF v_Balance < p_Amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds for transfer');
  END IF;

  -- Deduct from source
  UPDATE Customers2
  SET Balance = Balance - p_Amount
  WHERE CustomerID = p_FromCustID;

  -- Add to target
  UPDATE Customers2
  SET Balance = Balance + p_Amount
  WHERE CustomerID = p_ToCustID;

  COMMIT;
END;
/
EXECUTE TransferFunds(1, 2, 1000);

SELECT * FROM CUSTOMERS2;