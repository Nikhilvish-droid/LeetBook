SELECT (
    SELECT salary
    FROM (
        SELECT salary,
               DENSE_RANK() OVER (ORDER BY salary DESC) AS salary_rank
        FROM Employee
    ) t
    WHERE salary_rank = 2
    LIMIT 1
) AS SecondHighestSalary;