DROP TABLE IF EXISTS highscore;

CREATE TABLE highscore
(
    id    INT AUTO_INCREMENT PRIMARY KEY,
    name  VARCHAR(250) NOT NULL,
    score INT          NOT NULL
);

INSERT INTO highscore (name, score)
VALUES ('Aliko', 12),
       ('Bill', 5),
       ('Folrunsho', 7);