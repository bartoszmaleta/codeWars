SELECT
  name,
  weight,
  price,
  CAST(
    ROUND(CAST(price / (weight / 1000) AS NUMERIC), 2) AS FLOAT --DOUBLE PRECISION
  ) AS price_per_kg
FROM products
ORDER BY
  price_per_kg ASC,
  name ASC

-- round((price * 1000 / weight)::numeric, 2)::float as "price_per_kg"
