# Write your MySQL query statement below
select e.name, b.bonus from employee e left outer join bonus b on e.empid=b.empid where b.bonus <1000 or b.bonus is null;