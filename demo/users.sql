CREATE DATABASE username;
USE username;
CREATE TABLE username
(
id int UNSIGNED PRIMARY KEY AUTO_INCREMENT,
username_name VARCHAR(50) NOT NULL,
username_password VARCHAR(20) NOT NULL,
username_role VARCHAR(10) NOT NULL DEFAULT 'Subscriber'
);
INSERT INTO username(username_name, username_password, username_role) VALUE
('Test', 'test', 'Subscriber'),
('Admin','pass','Admin');

SELECT * FROM username;
SELECT username_name FROM username;

SELECT username_name FROM username WHERE username_name = 'Test' and username_password = 'test';