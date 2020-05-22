--your statment goes here--
SELECT
CASE
  WHEN yr < 100 THEN 1
  WHEN yr % 100 = 0 THEN yr / 100
  WHEN yr % 100 > 0 THEN yr / 100 + 1
END AS century
FROM years