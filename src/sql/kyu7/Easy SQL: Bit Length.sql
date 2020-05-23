/*  SQL  */

SELECT
  id,
  BIT_LENGTH(CAST(name AS VARCHAR(30))) AS name,
  birthday,
  BIT_LENGTH(CAST(race AS VARCHAR(50))) AS race

  FROM demographics