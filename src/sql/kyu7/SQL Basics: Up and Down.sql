/*  SQL  */
SELECT

  CASE
    WHEN (SUM(number1) % 2 <> 0) THEN (SELECT MIN(number1) FROM numbers)
    WHEN (SUM(number1) % 2 = 0) THEN (SELECT MAX(number1) FROM numbers)
  END AS number1,

  CASE
    WHEN (SUM(number2) % 2 <> 0) THEN (SELECT MIN(number2) FROM numbers)
    WHEN (SUM(number2) % 2 = 0) THEN (SELECT MAX(number2) FROM numbers)
  END AS number2


FROM numbers