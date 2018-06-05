
USE adlister_db;

TRUNCATE users;
TRUNCATE ads;

INSERT INTO users (username,email,password) VALUES
('Jackson','michael@jackson.com','password'),
('Noah','Noah@Ark.com','password'),
('Monica','Mon@Dance.com','password'),
('Robert','Robert@NotSpicy.com','password'),
('Wayne','Wayne@Boots.com','password');

INSERT INTO ads (title,description) VALUES
('Playstation for sale','This is a slightly used playstation'),
('uper Nintendo','Get your game on with this old-school classic!'),
('Junior Java Developer Position','Minimum 7 years of experience required. You will be working in the scripting language for Java, JavaScript'),
('JavaScript Developer needed','Must have strong Java skills');