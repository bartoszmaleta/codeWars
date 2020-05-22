--# write your statement here: you will be given a table 'moves'
-- with columns 'position' and 'roll'. return a table with a column 'res'. #--

SELECT
((roll * 2) + position)

AS res


FROM moves