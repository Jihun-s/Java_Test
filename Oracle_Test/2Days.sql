--학생 정보 테이블

create table student(
    num number(10) primary key,
    name varchar2(30) not null,
    phone varchar2(20),
    adress varchar2(100),
    birth date,                 --시간 생략하면 00시00분00초 초기화
    java number(3) default 0,
    db number(3) default 0,
    html number(3) default 0
);

--시퀀스 생성
create sequence student_seq;

drop table student
drop sequence student_seq;

--저장
insert into student values(student_seq.nextval, '홍길동', '010-1111-1111', '서울시 강남구 삼성동 111', '2002-04-11', 100, 90, 80);
insert into student (num, name) values (student_seq.nextval, '김철수');
insert into student values(student_seq.nextval, '홍길동', '010-2222-1111', '서울시 강남구 삼성동 111', '1997-10-30', 100, 90, 80);
insert into student values(student_seq.nextval, '김길동', '010-3333-2345', '부산시 강남구 삼성동 111', '2000-05-11', 100, 90, 80);
insert into student values(student_seq.nextval, '이영희', '010-4444-1111', '광주시 강남구 삼성동 111', '2000-05-15', 100, 90, 80);
insert into student values(student_seq.nextval, '이철수', '010-5555-1111', '서울시 강남구 삼성동 111', '2000-11-11', 100, 90, 80);
commit;

update student set db = 70, html = 100 where num = 2;

select* from student;

--이름이 "홍길동"인 학생의 번호, 이름, 전화번호, 주소
select
    num
    ,name
    ,phone
    ,adress
from
    student
where
    name like '홍길동'         --들여쓰기가 자유로운 언어이므로 잘 정리해서 쓰자
;
--java, db, html 점수가 모두 60점 이상
select* from student where java >=60 and db >=60 and html >=60;
select* from student where name like '김%';
select* from student where (java+db+html)/3<=50;
select* from student where adress like '%삼성동%';
select* from student where phone is null;
select (java+db+html)/3 as ave, name from student;

-------------------- 문자열 함수 --------------------
--대문자로 변경
select upper('aBcDe') from dual;
select Lower('aBcDe') from dual;

--대소문자 구분하지 않고 이름 검색
select*from student where upper(name) like upper('%kim%');
--모든 학생의 이름과 이름 글자 수
select name, length(name) from student where length(name)>=3;
--이름이 두 글자인 학생
select name from student where length(name) = 2;
--w전화번호 중 앞 3글자 출력
select name, substr(phone, 2, 4) from student;
--전화번호 앞 3글자가 '010'인 사람
select* from student where substr(phone, 1, 3) like '010';

--모든 학생의 평균 점수와 이름을 출력
select name, round((java+db+html)/3, -1) total from student;            --계산결과는 round 활용. -1은 반올림. 그냥 자를땐 trunc
-- 나머지 구하기
select mod(10, 3) from dual;

--날짜 데이터
select name, birth, sysdate from student;
--날짜 빼기 : 일 단위 차이
select name, sysdate-birth from student;
--날짜 더하기 : 일 단위 추가
select name, birth + 1 from student;
--날짜 더하기 : 월 단위 추가
select name, add_months(birth, 3) from student;

--날짜 형식 지정해서 문자열로 변환
select sysdate from dual;
select to_char(sysdate, '"오늘 날짜 "mm"월" dd"일"') from dual;

select name, to_char(birth, 'mm"월" dd"일"') from student;

--생일이 11월인 학생
select name, to_char(birth, 'mm"월"') from student where to_char(birth, 'mm') like 11;
--2000년 이후 출생자
select name, to_char(birth, 'yyyy"년"') from student where to_char(birth, 'yyyy') > 2000;            --위험함. 숫자로서 활용 불가
select name, to_char(birth, 'yyyy"년"') from student where to_number(to_char(birth, 'yyyy')) > 2000; --정답
--2000년 출생
select name, to_char(birth, 'yyyy"년"') from student where to_char(birth, 'yyyy') = 2000;
select name, to_char(birth, 'yyyy"년"') from student where birth>='2000-01-01' and birth<'2001-01-01';;

--각 학생들의 올해 생일을 "2023년 11월 11일" 형식으로 출력
select name, to_char(sysdate, 'yyyy"년" ')||to_char(birth, 'mm"월" dd"일"') from student where birth is not null;  --','가아닌 '||'로 나열
--2022년 5월 30일 기준으로 태어난지 며칠 지났는지?
select name, to_date(20220530)-birth from student;
select name, to_date('2022-05-30','yyyy-mm-dd')-birth from student;
select to_date(20220530) from dual;

--생일이 이달
select name, to_char(birth, 'mm"월"') from student where to_char(birth, 'mm') = to_char(sysdate, 'mm');
--생일이 10일 이내
select name, birth from student 
where
    to_date(to_char(sysdate, 'yyyy')||to_char(birth,'mmdd'),'yyyymmdd') - sysdate between 0 and 10 
    and birth is not null;
--생일이 5,6,10월
select name, to_char(birth, 'mm"월"') from student where to_number(to_char(birth, 'mm')) in (5, 6, 10);
--각 학생의 나이
select name, abs(to_number(to_char(sysdate, 'yyyy')) - to_number(to_char(birth, 'yyyy'))) age from student;


create sequence abc;

select abc.nextval from dual;       --1행 1열짜리 테이블. dual. 간단한 계산만 할 경우 활용. 일반 테이블은 그 테이블 행만큼 실행됨
select abc.currval from dual;
select* from dual;
drop sequence abc;

select 1+1 from dual;

--null처리 함수
--NVL([NULL인지 여부를 검사할 데이터 또는 열(필수)],
--      [앞의 데이터가 NULL일 경우 반환할 데이터](필수))
select name, birth, java from student;
select name, birth, nvl(java, 0) + 10 from student;
select name, nvl(adress, 'X') from student;

--NVL2([NULL인지 여부를 검사할 데이터 또는 열(필수)],
--      [앞 데이터가 NULL이 아닐 경우 반환할 데이터 또는 계산식(필수)],
--      [앞 데이터가 NULL일 경우 반환할 데이터 또는 계산식(필수)])
select name, nvl2(adress, 'O', 'X') from student;

--다중행 함수
select sum(java), avg(java), min(db) from student;
--김씨인 학생 수
select count(*) from student where name like '김%';

--adress 싹다 address 