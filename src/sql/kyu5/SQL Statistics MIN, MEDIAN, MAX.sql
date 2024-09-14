SELECT
  MIN(r.score) AS min
  , CAST(ROUND((SUM(r.score) / COUNT(score)), 1) AS FLOAT) AS median
  , MAX(r.score) AS max
FROM student s
LEFT JOIN result r
ON s.id = r.student_id
