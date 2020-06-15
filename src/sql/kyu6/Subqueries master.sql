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

-- ANOTHER OPTION
SELECT
    array_to_string(name[1:len-2], ' ') AS name
    , name[len - 1] AS first_lastname
    , name[len] AS second_lastname
FROM (
    SELECT
    name
    , array_length(name, 1) AS len
    FROM (
        SELECT
            string_to_array(name, ' ') AS name
        FROM people
    ) arr
) arr_and_len