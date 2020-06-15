SELECT
(regexp_split_to_table('2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97',E',')::int)
AS prime
ORDER BY prime ASC


-- ANOTHER SOLUTION
SELECT
    a.n AS prime
FROM
    generate_series(2, 100) AS a(n)
WHERE NOT EXISTS (
    SELECT
        1
    FROM
        generate_series(2 , a.n - 1) AS b(n)
    WHERE
        a.n % b.n = 0
    )