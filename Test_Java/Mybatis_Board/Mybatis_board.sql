[�Խ���]
--ȸ�� ���̺�
create table member(
    id          varchar2(20) PRIMARY KEY,
    password    varchar2(30) not null,
    name        varchar2(30) not null
);
insert into member values ('aaa','111','ȫ�浿');
insert into member values ('bbb','222','��ö��');
insert into member values ('ccc','333','��ö��');
--�Խñ� ���̺�
create table board(
    num         varchar2(11) primary key,
    id          varchar2(20),
    title       varchar2(300),
    contents    varchar2(3000),
    inputdate   date default sysdate,
    constraint  board_id_fk foreign key(id)
    references member(id)--on delete cascade (�� �ᵵ ��~)
);
--�� ��ȣ ������
create sequence board_seq;

--ex)
insert into member values ('aaa','111','ȫ�浿');
insert into board (num, id, title, contents)
values(board_seq.nextval, 'aaa','������','�۳���');