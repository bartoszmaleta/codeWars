SELECT
  project
  , regexp_replace(address, '[0-9]', '', 'g') AS letters
  , regexp_replace(address, '[a-zA-Z]', '', 'g') AS numbers
FROM repositories

-- SECOND SOLUTION
Select
    project
  , regexp_replace(address, '\d', '', 'g') as letters
  , regexp_replace(address, '\D', '', 'g') as numbers
From repositories

-- THIRD SOLUTION
SELECT
project,
--Replace all numbers in field with ''
REGEXP_REPLACE(address,'[[:digit:]]','','g') AS letters,
--Replace all letters in field with ''
REGEXP_REPLACE(address,'[[:alpha:]]','','g') AS numbers

FROM repositories
