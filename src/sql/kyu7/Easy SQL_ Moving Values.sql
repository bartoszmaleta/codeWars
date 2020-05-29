-- SELECT * FROM monsters
SELECT
LENGTH(CAST(name AS VARCHAR(30))) AS id,
LENGTH(CAST(legs AS VARCHAR(30))) AS name,
LENGTH(CAST(arms AS VARCHAR(30))) AS legs,
LENGTH(CAST(characteristics AS VARCHAR(30))) AS arms,
LENGTH(CAST(id AS VARCHAR(30))) AS characteristics
FROM monsters