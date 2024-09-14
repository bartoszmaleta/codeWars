-- Create your SELECT statement here

SELECT
p.*
, COUNT(s.sale) AS sale_count
, RANK() OVER (
    ORDER BY COUNT(s.sale)
    ) AS sale_rank
FROM people AS p
JOIN sales AS s
ON p.id = s.people_id
GROUP BY p.id
