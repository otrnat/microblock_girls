drop schema public cascade;
drop table user if exists;

create table user(
	id integer,
	first_name varchar(15),
	email varchar(30),
	username varchar(15),
	password varchar(15)
);

drop table follower if exists;

create table follower (
	id integer,
	follower varchar(15),
	following varchar(15),
	primary key (id),
	unique (follower, following)
);

drop table post if exists;
create table post (
	id integer,
	post_time timestamp,
	username varchar(15),
	content varchar(300)
);