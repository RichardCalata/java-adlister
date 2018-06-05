USE adlister_db;

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS ads;
CREATE TABLE users(
id int unsigned not null auto_increment,
username varchar(100),
email varchar(100),
password varchar(100),
primary key(id)

)


CREATE TABLE ads(
id int unsigned not null auto_increment,
user_id int unsigned,
title varchar(100),
description text(1000),
PRIMARY KEY(id),
FOREIGN KEY (user_id) REFERENCES users(id)

)

select * from users;

select * from ads;