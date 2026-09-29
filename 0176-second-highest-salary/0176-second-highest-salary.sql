# Write your MySQL query statement belowselect salary
select max(salary) as SecondHighestSalary from employee where salary < (select max(salary) from employee);