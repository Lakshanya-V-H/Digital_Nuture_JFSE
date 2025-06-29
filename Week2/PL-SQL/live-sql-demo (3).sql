BEGIN
  FOR rec IN (
    SELECT LoanID, CustomerID, DueDate
    FROM Loans
    WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
      AND ReminderSent = 'N'
  ) LOOP
    -- Print reminder message
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Customer ' || rec.CustomerID ||
      ' has a loan due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY')
    );

    -- Mark reminder as sent
    UPDATE Loans
    SET ReminderSent = 'Y'
    WHERE LoanID = rec.LoanID;
  END LOOP;

  COMMIT;
END;
/
SELECT * from LOANS;