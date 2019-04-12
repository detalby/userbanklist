#DROP DATABASE IF EXISTS userlist;
#CREATE DATABASE userlist;

DROP TABLE IF EXISTS accounts_list;
DROP TABLE IF EXISTS users;


CREATE TABLE users
(
  id      INT PRIMARY KEY AUTO_INCREMENT,
  name    VARCHAR(10) NOT NULL,
  surname VARCHAR(10) NOT NULL
);


CREATE TABLE accounts_list (
  id      INTEGER PRIMARY KEY AUTO_INCREMENT,
  account INTEGER NOT NULL,
  user_id INTEGER NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users (id)
    ON DELETE CASCADE,
  CONSTRAINT UNIQUE user_account_idx (id, user_id)

);


INSERT into users (name, surname)
VALUES ('Alex', 'Lukashenko'),
       ('Nick', 'Lukashenko'),
       ('Viktor', 'Lukashenko'),
       ('Darth', 'Vader'),
       ('Dmitry', 'Medvedev'),
       ('Kim', 'Chen Yn'),
       ('Nick', 'Moduro'),
       ('Mickolai', 'Poroshenko'),
       ('Donald', 'Trump'),
       ('Nursultan', 'Nazarbaev');

insert into accounts_list (account, user_id)
VALUES (10000, 1),
       (100, 2),
       (1000, 3),
       (100000, 4),
       (10000, 5),
       (1000, 6),
       (10, 7),
       (100, 8),
       (10000, 9),
       (1000, 10);
