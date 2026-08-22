# Write your MySQL query statement below
-- SELECT MAX(SALARY) AS SECONDHIGHESTSALARY 
-- FROM EMPLOYEE
-- WHERE SALARY <(SELECT MAX(SALARY) FROM EMPLOYEE);


-- remember max over null set return null so we add max(salary)
-- SELECT MAX(SALARY) AS SecondHighestSalary
--  FROM(
--     SELECT SALARY ,
--     DENSE_RANK() OVER (ORDER BY SALARY DESC) AS RNK 
--     FROM EMPLOYEE
--  ) T
--  WHERE RNK=2;

SELECT (
    SELECT DISTINCT SALARY from employee
    order by salary desc 
    limit 1 offset 1

)
AS SecondHighestSalary;






