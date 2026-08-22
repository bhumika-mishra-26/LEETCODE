CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      SELECT MAX(SALARY)  as salary 
      from (
        select salary ,
        DENSE_RANK() over (ORDER BY SALARY DESC) as rnk
        from employee
      )t 
      where rnk=n


      
      

  );
END