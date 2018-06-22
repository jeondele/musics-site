drop table people;

create table people(
	id varchar2(30) primary key,
	password varchar2(30) not null,
	name varchar2(20) not null,
	gender varchar2(20) not null,
	birthday varchar2(20) not null
);

insert into people values('yys', 'tester', '윤예슬', 'female', '930407');

select * from people;
