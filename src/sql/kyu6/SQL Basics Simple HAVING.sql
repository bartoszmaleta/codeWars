SELECT
age
, COUNT(id)
AS total_people

FROM people
GROUP BY age
HAVING COUNT(age) >= 10
