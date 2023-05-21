--학생 정보 테이블
create table student(
	name	varchar2(20)	not null,	--학생 이름
	id		varchar2(20)	primary key,--학번
	phone	varchar2(30),				--전화번호
	kor		number(3)		default 0,	--국어점수
	eng		number(3)		default 0,	--영어점수
	mat		number(3)		default 0	--수학점수
);
--저장 예
insert into student values('홍길동', '1111', '010-1111-2222', 100, 80, 90);

select* from student;

commit;