--LUNCHBOX 테이블 생성
create table lunchbox(
    lunchbox_id varchar2(20)  PRIMARY KEY,
    menu_title  varchar2(100) not null,
    price       varchar2(7)   not null
);
--CUSTOMER 테이블 생성
create table customer(
    cust_id    varchar2(20)  PRIMARY KEY,
    cust_name  varchar2(60)  not null,
    address    varchar2(200) not null,
    phone      varchar2(40)  not null
);
--ORDERINFO 테이블 생성
create table orderinfo(
    order_id       number(20)       PRIMARY KEY,
    cust_id        varchar2(20)     not null,
    lunchbox_id    varchar2(20)     not null,
    order_count    number(20)       default 1,
    order_date     date             default sysdate,
    constraint orderinfo_cust_id_fk foreign key(cust_id) references customer(cust_id),
    constraint orderinfo_lunchbox_id_fk foreign key(lunchbox_id) references lunchbox(lunchbox_id)
);
-- ORDER-_SEQ 시퀀스 생성
create sequence order_seq;
--도시락 종류 5개 이상..
insert into lunchbox values('m01', '치킨스테이크 덮밥', 10000);
insert into lunchbox values('m02', '돈치스팸 도시락', 7000);
insert into lunchbox values('m03', '참치마요 덮밥',8000);
insert into lunchbox values('m04', '우나기동', 15000);
insert into lunchbox values('m05', '우니동', 30000);
commit;
select* from lunchbox;
--CUSTOMER 
insert into customer values('id1', '김지훈', '서울시 강남구 삼성동 111','010-1111-2222');
insert into customer values('id2', '나휘선', '부산시 강남구 삼성동 111','010-2222-2222');
insert into customer values('id3', '홍길동', '광주시 강남구 삼성동 111','010-3333-2222');
insert into customer values('id4', '김길돋', '서울시 도봉구 도봉동 222','010-4444-2222');
insert into customer values('id5', '하나님', '서울시 도봉구 방학동 333','010-5555-2222');
commit;

insert into orderinfo values(student_seq.nextval, 'id1', 'm01', '2', sysdate);
insert into orderinfo values(student_seq.nextval, 'id1', 'm01', '3', sysdate);
insert into orderinfo values(student_seq.nextval, 'id2', 'm02', '4', sysdate);
insert into orderinfo values(student_seq.nextval, 'id3', 'm03', '2', sysdate);
insert into orderinfo values(student_seq.nextval, 'id4', 'm04', '3', sysdate);
insert into orderinfo values(student_seq.nextval, 'id5', 'm05', '1', sysdate);
insert into orderinfo values(student_seq.nextval, 'id2', 'm04', '4', sysdate);
insert into orderinfo values(student_seq.nextval, 'id3', 'm04', '2', sysdate);
insert into orderinfo values(student_seq.nextval, 'id4', 'm01', '3', sysdate);
insert into orderinfo values(student_seq.nextval, 'id5', 'm01', '1', sysdate);
insert into orderinfo values(student_seq.nextval, 'id5', 'm01', '1', '2022/01/01');
commit;
select* from orderinfo;
delete from orderinfo where lunchbox_id = 'm01';

--"치킨"이라는 단어가 포함된 도시락 종류를 조회하는 쿼리문
select menu_title from lunchbox where menu_title like '%치킨%';
--customer  --lunchbox  --lunchbox  --orderinfo --lunchbox&&orderinfo   --orderinfo
select cust_name "고객이름", 
       menu_title "도시락이름", 
       price "가격", 
       order_count "주문수량", 
       l.price*o.order_count "주문금액", 
       order_date "주문일"
from lunchbox l, customer c, orderinfo o
where o.cust_id = c.cust_id and o.lunchbox_id = l.lunchbox_id
group by o.order_date, cust_name, menu_title, price, order_count, l.price*o.order_count, order_date
order by o.order_date desc;



select menu_title "도시락이름",
       nvl(sum(order_count), 0) "총판매수량",
       nvl(sum(l.price*o.order_count),0) "총판매금액"
from lunchbox l, orderinfo o
where o.lunchbox_id(+) = l.lunchbox_id
group by menu_title
order by menu_title;






select* from customer;

drop table customer;
drop table orderinfo;
drop sequence order_seq;
drop table lunchbox;






