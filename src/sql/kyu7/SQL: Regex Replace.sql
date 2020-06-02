select project, commits,
contributors,
 REGEXP_REPLACE(address, '\d', '!', 'g') as  address from repositories;


--ANOTHER SOLUTION
SELECT project, commits, contributors,
  REGEXP_REPLACE(address, '[[:digit:]]', '!', 'g') AS address
FROM repositories