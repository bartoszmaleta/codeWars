
SELECT CONCAT(INITCAP(firstname), ' ', INITCAP(lastname)) AS shortlist FROM Elves
WHERE firstname LIKE '%tegil%' OR lastname LIKE '%astar%'


----------------------------------



SELECT INITCAP(CONCAT(firstname, ' ', lastname)) AS shortlist FROM Elves
WHERE firstname LIKE '%tegil%' OR lastname LIKE '%astar%'