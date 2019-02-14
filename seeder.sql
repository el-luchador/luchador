CREATE DATABASE IF NOT EXISTS Luchador_db;

USE Luchador_db;
DROP TABLE admin;
CREATE TABLE admin (
  id INT UNSIGNED AUTO_INCREMENT NOT NULL,
  admin_first_name VARCHAR(240),
  admin_last_name VARCHAR(240),
  PRIMARY KEY(id)
);

DROP TABLE user;
CREATE TABLE user (
  id INT UNSIGNED AUTO_INCREMENT NOT NULL,
  user_first_name VARCHAR(240),
  user_last_name VARCHAR(240),
  PRIMARY KEY (id)
)