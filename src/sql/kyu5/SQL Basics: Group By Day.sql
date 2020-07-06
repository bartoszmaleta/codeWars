SELECT
  date(created_at) AS day
  , description
  , count(*) AS count
FROM events
WHERE name = 'trained'
GROUP BY day, description