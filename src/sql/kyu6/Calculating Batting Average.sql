SELECT
 player_name,
 games,
-- ANTOHER OPTION:
--   round(hits::numeric / at_bats, 3)::text as batting_average
 CAST(ROUND((hits + 0.0) / at_bats, 3) AS VARCHAR(10)) AS batting_average
FROM yankees
WHERE at_bats >= 100
ORDER BY batting_average DESC