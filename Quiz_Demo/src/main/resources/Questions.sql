CREATE TABLE `quizgame`.`questions` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Question` VARCHAR(50) NOT NULL,
  `AnswerA` VARCHAR(25) NOT NULL,
  `AnswerB` VARCHAR(25) NOT NULL,
  `AnswerC` VARCHAR(25) NOT NULL,
  `AnswerD` VARCHAR(25) NOT NULL,
  `CorrectAns` CHAR(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

INSERT INTO questions (Question, AnswerA, AnswerB, AnswerC, AnswerD, CorrectAns) VALUES('What is 2 + 2?', '22', '4', '44', 'Q', 'B');
INSERT INTO questions (Question, AnswerA, AnswerB, AnswerC, AnswerD, CorrectAns) VALUES('What is Rick\'s name?', 'Rick', 'Jick', 'Bick', 'Morty', 'A');
INSERT INTO questions (Question, AnswerA, AnswerB, AnswerC, AnswerD, CorrectAns) VALUES('What is the first letter of the alphabet?', 'A', 'B', 'C', 'Triangle', 'A');

-- Use this to create the table for use in this demo