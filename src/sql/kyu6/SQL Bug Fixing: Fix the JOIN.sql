SELECT
  j.job_title,
  CAST(ROUND((SUM(j.salary) / COUNT(p)), 2) AS FLOAT) AS average_salary,
  COUNT(p.id) AS total_people,
  CAST(ROUND(SUM(j.salary), 2) AS FLOAT) AS total_salary
  FROM people p
    INNER JOIN job j
    ON p.id = j.people_id
  GROUP BY j.job_title
  ORDER BY average_salary DESC
  LIMIT 100