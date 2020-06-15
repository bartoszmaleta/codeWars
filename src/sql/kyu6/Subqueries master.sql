-- SELECT *
-- FROM people
SELECT
  (SELECT SPLIT_PART(name, ' ', 1) FROM people))
  AS name
  , (SELECT SPLIT_PART(name, ' ', 2) FROM people))
  AS first_lastname
  , (SELECT SPLIT_PART(name, ' ', 3) FROM people))
  AS second_lastname

FROM people

SELECT
  SPLIT_PART(name, ' ', 1)
  AS name
  , SPLIT_PART(name, ' ', 2)
  AS first_lastname
  , SPLIT_PART(name, ' ', 3)
  AS second_lastname

FROM people

SELECT
  CASE
    WHEN
      SPLIT_PART(name, ' ', 4) = ''
        THEN
            SPLIT_PART(name, ' ', 1)
        ELSE
            CONCAT(SPLIT_PART(name, ' ', 1), ' ', SPLIT_PART(name, ' ', 2))
  END AS name
  , CASE
    WHEN
      SPLIT_PART(name, ' ', 4) = ''
        THEN
            SPLIT_PART(name, ' ', 2)
        ELSE
            SPLIT_PART(name, ' ', 3)
  END AS first_lastname
  , CASE
      WHEN
        SPLIT_PART(name, ' ', 4) = ''
          THEN
              SPLIT_PART(name, ' ', 3)
          ELSE
              SPLIT_PART(name, ' ', 4)
    END AS second_lastname
FROM people