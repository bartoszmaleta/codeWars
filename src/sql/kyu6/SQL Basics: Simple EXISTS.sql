SELECT
  d.id,
  d.name
FROM departments d
WHERE EXISTS (
  SELECT
    s.id
  FROM sales s
  WHERE s.department_id = d.id
  AND s.price > 98
)