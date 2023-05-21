--HR 계정 데이터

--전체 사원 정보
select* from employees;
--이름에 "ne"가 포함된 사원
select* from employees where upper(first_name)||upper(last_name) like upper('%ne%');
--이름의 첫자, 성의 첫자 출력 (예) S.K)
select substr(first_name,1,1)||'.'||substr(last_name,1,1) from employees;
--전화번호의 뒤자리 4자
select first_name, last_name, substr(phone_number, length(phone_number) - 3,4) from employees;
--급여 역순으로 출력
select* from employees order by salary desc;
--2005년 입사자
select* from employees where to_char(hire_date, 'yyyy') = '2005';
--급여 총액(급여 + 급여의 일정 비율)
select first_name, last_name, salary + (salary*nvl(commission_pct, 0)) from employees;
--전체 직원의 급여 평균
select avg(salary) from employees;
--80번 부서의 급여 평균
select round(avg(salary),1) from employees where department_id = 80;

--그룹
select
    department_id, round(avg(salary),1) avg     --4
from
    employees                                   --1
where
    department_id is not null                   --2
group by
    department_id                               --3
order by
    department_id                               --5
;

--급여가 3000이상인 사원들의 부서별 급여 평균
select
    department_id, round(avg(salary),1) avg
from
    employees
where
    department_id is not null
    and salary >= 3000
group by
    department_id
order by
    department_id
;
--평균이 5000 이상인 부서들의 부서별 급여 평균을 역순
select
    department_id, round(avg(salary),1) avg
from
    employees
where
    department_id is not null
group by
    department_id
having
    round(avg(salary),1)  >= 5000
order by
    avg desc
;

--job_id가 IT_PROG, SA_MAN, FI_ACCOUNT, ST_MAN인 사원들을 대상으로
--입사 년도별 급여 평균을 구해서 입사년도 순으로 출력
--단, 급여 평균이 5000~10000인 경우만 출력.
select
    to_char(hire_date, 'yyyy') hire_year, round(avg(salary),1) avg
from
    employees
where
    job_id in ('IT_PROG', 'SA_MAN', 'FI_ACCOUNT', 'ST_MAN')
group by
    to_char(hire_date, 'yyyy')
having
    round(avg(salary),1) between 5000 and 10000
order by
    hire_year
;

--급여가 7000이상인 사원이 부서별로 몇 명?
select
    department_id, count(*)
from
    employees
where
    salary >= 7000
group by
    department_id
order by
    department_id
;

--전체 급여 평균보다 많은 급여를 받는 사원
select
    *
from
    employees
where
    salary >= (select avg(salary) from employees);          --서브쿼리. 남용하면 속도 문제 발생

--사원이름, 부서명 출력
select
    (select department_name from departments d where e.department_id = d.department_id) dname
    , first_name, department_id
from
    employees e
order by
    department_id
;




--끝줄