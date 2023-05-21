--회원 정보 테이블

--테이블 생성 DDL 데이터 정의어
create table person (
    num     number(10) primary key,     --회원번호(숫자, 10자리, 기본키)
    name    varchar2(30) not null,      --이름 (문자열, 10자)
    phone   varchar2(20),               --전화번호 (문자열, 20자)
    age     number(3),                  --나이 (숫자, 3자리)
    height  number(4,1)                 --키 (숫자, 4자리, 소수점 1자리)
);

--테이블 삭제
drop table person;

--DML 데이터 조작어
insert into person values(1, '홍길동', '010-1111-1111', 22, 166.6);
insert into person (num, name)values(2, '김철수');
insert into person values(3, '김길동', '010-1111-1111',33,177.7);
--insert into persion (num) values (3);     --   ORA-00942

--수정
update person set age = 26, height = 155 where num=2;

--삭제
delete from person where num = 2;

--조회 DQL, 구 DML
select*from person;
select num, name, age from person;
select* from person where num = 1;

--별칭
select name, age + 1 age from person;
select name as "이름", age "나이" from person;   --as는 생략 가능.

--정렬
select* from person order by num;               --오름차순 정렬
select* from person order by name desc;         --이름순, 역순,
select* from person order by name desc, num;    --같은 이름은 넘순.

--연산자
--번호가 1번인 회원
select* from person where num = 1;
--나이가 25세 이상인 회원
select*from person where age>=25;
--나이가 25~30세
select*from person where age>=25 and age<=30;
select*from person where age between 25 and 30;         --between 연산자.

--나이가 23세이거나 27세이거나 33세
select*from person where age=23 or age = 27 or age =33; --in으로 간략화 가능
select*from person where age in (23, 27, 33);           --in 연산자.

--NULL값 찾기
select*from person where phone is null;
select*from person where phone is not null;

--이름이 홍길동
select*from person where name = '홍길동';
select*from person where name like '홍길동';   --와일드카드 검색할땐 반드시 like문 사용

--홍씨 - 와일드카드 검색...
select*from person where name like '홍%';
--이름이 "길동"으로 끝나는 회원
select*from person where name like '%길동';
--이름에 "동"이 포함된 회원
select*from person where name like '%동%';
--성이 홍, 이름이 외자
select*from person where name like '홍__';   --'_'갯수별로 글자 수

--트랜젝션 - 취소할 수 있는 단위. 트랜젝션 관리. commit, rollback
commit;
select*from person order by num;
delete from person where num = 3;
commit;
delete from person where num = 2;
rollback;

--first_name이 A로 시작
select*from employees where first_name like 'A%';
--전화번호에 "123"이 포함
select*from employees where phone_number like '%123%';
--부서번호가 30, 50 , 60 중 하나
select*from employees where department_id in (30, 50, 60) order by department_id;
--salary가 5000~10000인 사람
select*from employees where salary between 5000 and 10000 order by salary;

--이 회사의 부서번호를 순서대로 출력(중복 제거)
select DISTINCT department_id from employees order by department_id;

--문자열 연결
select first_name ||''|| last_name name from employees;
