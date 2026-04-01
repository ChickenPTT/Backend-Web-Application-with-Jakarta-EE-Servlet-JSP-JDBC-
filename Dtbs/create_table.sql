use newservlet;

CREATE TABLE role(
	id bigint NOT NULL primary key auto_increment,
    name varchar(255) not null,
    code varchar(255) not null,
	createdate  timestamp null,
    modifieddate timestamp null,
	createby varchar(255) null,
    modifiedby  varchar(255) null
);

CREATE TABLE user(
	id bigint NOT NULL primary key auto_increment,
	username VARCHAR(255) not null,
	pass VARCHAR(255) not null,
    fullname VARCHAR(255) not null,
	status int not null,
    roleid bigint not null,
    createdate  timestamp null,
    modifieddate timestamp null,
	createby varchar(255) null,
    modifiedby  varchar(255) null	
);
	
alter TABLE user add constraint fk_user_role FOREIGN KEY (roleid) REFERENCES role(id) ;

CREATE TABLE news(
	id bigint NOT NULL primary key auto_increment,
	title VARCHAR(255) null,
    thumbnail VARCHAR(255) null,
	shortdecription text not null,
    content text not null,
	categoryid bigint not null,
    createdate  timestamp null,
    modifieddate timestamp null,
	createby varchar(255) null,
    modifiedby  varchar(255) null	
);
CREATE TABLE category(
	id bigint NOT NULL primary key auto_increment,
	name varchar(255) not null,
    code varchar(255) not null,
    createdate  timestamp null,
    modifieddate timestamp null,
	createby varchar(255) null,
    modifiedby  varchar(255) null	
);
alter table news add constraint fk_news_category FOREIGN KEY (categoryid) REFERENCES category(id);

CREATE TABLE comment(
	id bigint NOT NULL primary key auto_increment,
	comment text not null,
    user_id bigint not null,
    news_id bigint not null,
    createdate  timestamp null,
    modifieddate timestamp null,
	createby varchar(255) null,
    modifiedby  varchar(255) null	

);
alter table comment add constraint fk_comment_user FOREIGN KEY (user_id) REFERENCES user(id);
alter table comment add constraint fk_comment_news FOREIGN KEY (news_id) REFERENCES news(id);