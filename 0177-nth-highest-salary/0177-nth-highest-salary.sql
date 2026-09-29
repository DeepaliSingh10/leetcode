CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set N=n-1;
  RETURN (

      # Write your MySQL query statement below.
     SELECT DISTINCT salary
      FROM Employee
      ORDER BY salary DESC
      LIMIT 1 offset N
  );
END