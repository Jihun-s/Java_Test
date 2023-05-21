--부서별로 사원수를 부서번호, 사원수로 출력
select department_id as id, count(*) from employees group by department_id order by id;

--모든 사람들의 성을 오름차순으로. 중복제외.
select last_name from employees order by last_name;

--2명 이상 존재하는 성을 인원수와 함계 출력
select last_name, count(*) from employees group by last_name having count(*)>1 order by last_name;      --having 주의

--서브쿼리
--사원 이름, 부서명 출력. 전체 급여 평균보다 높은 급여를 받는 사원만.
select
    first_name
    ,last_name
    ,(select
        department_name
      from
        departments d
      where
        e.department_id = d.department_id) dname
    ,salary
from
    employees e
where
    salary >= (select avg(salary) from employees)
order by
    salary DESC
;

--사원이름, 그 사원의 매니저 이름
select
    first_name
    ,last_name
    ,(select
        first_name
        ||' '||last_name
      from
        employees e2
      where
        e.manager_id = e2.employee_id) name
from
    employees e
;

--조인
select* from employees e, departments d where e.department_id = d.department_id and salary>13000;

--이름, 부서명 출력
select first_name, last_name, department_name from employees e, departments d where e.department_id = d.department_id;

--도시명 국가명 출력
select city, country_name from locations l, countries c where l.country_id = c.country_id;

--사원명, 부서명, 도시명
select first_name||' '||last_name name, department_name, city
from
    employees e, departments d, locations l
where
    e.department_id = d.department_id and d.location_id = l.location_id
;

select
    country_name
    ,count(*)
from
    employees e, departments d, locations l, countries c
where
    e.department_id = d.department_id and d.location_id = l.location_id and l.country_id = c.country_id
group by
    country_name
;

--도시별 급여평균. 평균 금액이 6000 이상인 도시만 금액순으로 출력
select
    city
    ,round(avg(salary),1) a
from
    employees e, departments d, locations l
where
    e.department_id = d.department_id and d.location_id = l.location_id
group by
    city
having
    round(avg(salary),1) >= 6000
order by
    a desc
;

--직원 이름과 그 매니저 이름 (join 이용)
select
    e.first_name||' '||e.last_name name
    ,e2.first_name||' '||e2.last_name manager
from
    employees e, employees e2
where
    e.manager_id = e2.employee_id(+)    --(+)는 조인 조건이 Null이던 아니던 출력.
    and e.salary > 13000
;
select first_name from employees where salary>13000;






--끝 줄