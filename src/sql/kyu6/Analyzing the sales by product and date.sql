SELECT
  name AS product_name
  , EXTRACT(YEAR FROM date)::int AS year
  , EXTRACT(MONTH FROM date)::int AS month
  , EXTRACT(DAY FROM date)::int AS day
  , SUM(price * count) AS total
FROM sales_details sd
JOIN sales s
  ON sd.sale_id = s.id
JOIN products p
  ON sd.product_id = p.id
GROUP BY
  name
  , ROLLUP(year, month, day)
ORDER BY
  product_name
  , year
  , month
  , day