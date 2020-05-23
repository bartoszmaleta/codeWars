-- Create your SELECT statement here

SELECT
products.id,
products.name,
products.isbn,
products.company_id,
products.price,
companies.name AS company_name
FROM products
LEFT JOIN companies
ON products.company_id = companies.id
