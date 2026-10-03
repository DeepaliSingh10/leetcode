# Write your MySQL query statement below
SELECT customer_number
FROM orders
group by customer_number order by count(*) desc limit 1;