# Write your MySQL query statement below
SELECT D.name as Department, E.name as Employee, E.salary as Salary
FROM Employee AS E
INNER JOIN Department AS D ON D.id = E.departmentid
WHERE (
SELECT COUNT(DISTINCT salary)
FROM Employee AS E2
WHERE E2.departmentid = D.id AND E2.salary >= E.salary
) <= 3