# Write your MySQL query statement below
select d.name as Department ,e.name as Employee ,e.salary 
from employee e
join department d
on e.departmentId=d.id
where e.salary=(
    select MAX(SALARY)
    from employee e3
      WHERE e3.departmentId = e.departmentId
);

