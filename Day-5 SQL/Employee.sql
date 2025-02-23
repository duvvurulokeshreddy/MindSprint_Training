select * from employees.employees;

use employees;
show tables;

select * from employees limit 5;

SELECT * FROM employees.departments;

SELECT first_name, last_name, title
FROM employees
JOIN titles ON employees.emp_no = titles.emp_no;

SELECT employees.first_name, employees.last_name, departments.dept_name
FROM employees
JOIN dept_emp ON employees.emp_no = dept_emp.emp_no
JOIN departments ON dept_emp.dept_no = departments.dept_no
WHERE departments.dept_name = 'Sales';
 
 SELECT AVG(salary) AS average_salary FROM salaries;
 
SELECT departments.dept_name, COUNT(dept_emp.emp_no) AS total_employees
FROM departments
JOIN dept_emp ON departments.dept_no = dept_emp.dept_no
GROUP BY departments.dept_name;
 
SELECT departments.dept_name, COUNT(dept_emp.emp_no) AS total_employees
FROM departments
JOIN dept_emp ON departments.dept_no = dept_emp.dept_no
GROUP BY departments.dept_name;


