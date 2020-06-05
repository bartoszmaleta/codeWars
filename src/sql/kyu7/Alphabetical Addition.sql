-- # write your statement here, see description for setup.
-- SELECT COUNT(letter) AS letter FROM letters

SELECT
  CASE
      WHEN SUM(ASCII(letter) - 96) % 26 = 0 THEN 'z'
      WHEN SUM(ASCII(letter) - 96) > 26 THEN CHR(CAST(SUM(ASCII(letter) - 96) % 26 AS INT) + 96)
      WHEN SUM(ASCII(letter) - 96) <= 26 THEN CHR(CAST(SUM(ASCII(letter) - 96) AS INT) + 96)
      ELSE 'z'
  END AS letter

FROM letters