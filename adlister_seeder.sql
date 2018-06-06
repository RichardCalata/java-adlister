
USE adlister_db;

TRUNCATE users;
TRUNCATE ads;

INSERT INTO users (username,email,password) VALUES
('Jackson','michael@jackson.com','password'),
('Noah','Noah@Ark.com','password'),
('Monica','Mon@Dance.com','password'),
('Robert','Robert@NotSpicy.com','password'),
('Wayne','Wayne@Boots.com','password');

INSERT INTO ads (user_id,title,description) VALUES
('2','Playstation for sale','This is a slightly used playstation'),
('3','Super Nintendo','Get your game on with this old-school classic!'),
('1','Junior Java Developer Position','Minimum 9 years of experience required. You will be working in the scripting language for Java, JavaScript'),
('1','JavaScript Developer needed','Must have strong Java skills, Must read minds');