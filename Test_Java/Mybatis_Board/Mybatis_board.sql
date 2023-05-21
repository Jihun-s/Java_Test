[게시판]
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
    constraint  board_id_fk foreign key(id)
    references member(id)--on delete cascade (안 써도 됨~)
);
--글 번호 시퀀스
create sequence board_seq;

--ex)
insert into member values ('aaa','111','홍길동');
insert into board (num, id, title, contents)
values(board_seq.nextval, 'aaa','글제목','글내용');