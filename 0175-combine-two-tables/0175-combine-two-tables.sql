# Write your MySQL query statement below

SELECT Person.firstName,Person.lastName,Address.city,Address.state
from person 
left join address
on Person.personId=Address.personId;

