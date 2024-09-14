SELECT
    p.name,
    SUM(CASE WHEN d.detail = 'good' THEN 1 ELSE 0 END) AS good,
    SUM(CASE WHEN d.detail = 'ok' THEN 1 ELSE 0 END) AS ok,
    SUM(CASE WHEN d.detail = 'bad' THEN 1 ELSE 0 END) AS bad
FROM products p
LEFT JOIN details d
ON p.id = d.product_id
GROUP BY p.name
ORDER BY name;
