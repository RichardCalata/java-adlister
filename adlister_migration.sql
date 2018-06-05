USE adlister_db;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS ads;
CREATE TABLE users(
primary key(id),
id int unsigned not null auto_increment,
username varchar(100),
email varchar(100),
password varchar(100);

)


CREATE TABLE ads(
id int unsigned not null auto_increment,
user_id int unsigened,
title varchar(100),
description text(1000),
PRIMARY KEY(id),
FOREIGN KEY (user_id) REFERENCES NCE user(id)

)