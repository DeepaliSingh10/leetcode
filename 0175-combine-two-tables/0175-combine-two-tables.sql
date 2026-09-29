# Write your MySQL query statement below
select p.firstname,p.lastname, a.city, a.state from address a right outer join person p on p.personid=a.personid;