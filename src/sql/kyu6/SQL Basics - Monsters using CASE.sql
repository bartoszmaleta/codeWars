SELECT
th.id
, th.heads
, th.arms
, bh.legs
, bh.tails
, CASE
    WHEN heads > arms OR tails > legs THEN 'BEAST'
    ELSE 'WEIRDO'
  END AS species
FROM top_half AS th
INNER JOIN bottom_half AS bh
ON th.id = bh.id
ORDER BY species ASC