--회원제 게시판

--회원 테이블
create table member(
    id          varchar2(20) PRIMARY KEY,
    password    varchar2(30) not null,
    name        varchar2(30) not null
);
insert into member values ('aaa','111','홍길동');
insert into member values ('bbb','222','김철수');
insert into member values ('ccc','333','이철수');
--게시글 테이블
create table board(
    num         varchar2(11) primary key,
    id          varchar2(20),
    title       varchar2(300),
    contents    varchar2(3000),
    inputdate   date default sysdate,
    constraint  board_id_fk foreign key(id) references member(id)--on delete cascade (안 써도 됨~)
);
--글 번호 시퀀스
create sequence board_seq;

insert into board (num, id, title, contents) values(board_seq.nextval, 'aaa','글제목','글내용');
insert into board (num, id, title, contents) values(board_seq.nextval, 'aaa','글제목','글내용');
insert into board (num, id, title, contents) values(board_seq.nextval, 'bbb','글제목','글내용');
insert into board (num, id, title, contents) values(board_seq.nextval, 'ccc','글제목','글내용');
insert into board (num, id, title, contents) values(board_seq.nextval, 'ccc','글제목','글내용java');
commit;

select* from member;
select* from member where id  = 'aaa';
select* from board order by num desc;
select title from board order by num;
select * from Board where num like 1;
select num, title, to_char(inputdate, 'yy/mm/dd/hh/mi/ss')
from board order by num;

--글번호, 작성자, 작성일을 번호 역순으로 출력
select num, id, to_char(inputdate, 'mm.dd') inputdate from board order by num DESC;

--글 삭제
delete from board where id = 'bbb';
--회원삭제
delete from member where id like 'aaa';

--글번호, 작성자 이름, 제목 출력
select num, id, title from board order by num DESC;
--회원별 글 작성 개수
select id, count(*) from board group by id;
--글 제목이나 내용에 'java'가 포함된 글
select* from board where title like '%java%' or contents like '%java%';
--회원별 글 개수를 모든 회원 이름과 개수로 출력

select m.id, count(b.num) 
from board b, member m 
where m.id = b.id(+) 
group by m.id;

SELECT m.id, COUNT(b.num)
FROM member m
INNER JOIN board b ON m.id = b.id
GROUP BY m.id;

SELECT m.id, COUNT(b.num)
FROM member m
LEFT OUTER JOIN board b ON m.id = b.id
GROUP BY m.id;

drop table member;


--게시판 테이블
--글 번호  - primary_key     ****
--작성자 - 화원 id           ////외래키
--제목
--내용

--리플(댓글)
--댓글 번호 - primary_key
--글 번호                   ****외래키
--작성자
--내용