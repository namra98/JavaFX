show databases;
create database sayan;

use sayan;

show tables;

CREATE TABLE supersayan (
                            name VARCHAR(255),
                            rollno INT,
                            seatno INT,
                            dob DATE,
                            chatgpt TEXT
);

INSERT INTO supersayan (name, rollno, seatno, dob, chatgpt)
VALUES
    ('Goku', 1, 101, '1990-05-12', 'Dummy chat with GPT for Goku.'),
    ('Vegeta', 2, 102, '1985-02-15', 'Dummy chat with GPT for Vegeta.'),
    ('Piccolo', 3, 103, '1993-07-20', 'Dummy chat with GPT for Piccolo.'),
    ('Gohan', 4, 104, '2000-12-25', 'Dummy chat with GPT for Gohan.'),
    ('Trunks', 5, 105, '2010-03-08', 'Dummy chat with GPT for Trunks.'),
    ('Bulma', 6, 106, '1980-01-30', 'Dummy chat with GPT for Bulma.'),
    ('Krillin', 7, 107, '1983-09-05', 'Dummy chat with GPT for Krillin.'),
    ('Android 18', 8, 108, '1992-04-18', 'Dummy chat with GPT for Android 18.'),
    ('Yamcha', 9, 109, '1988-11-11', 'Dummy chat with GPT for Yamcha.'),
    ('Tien', 10, 110, '1982-06-22', 'Dummy chat with GPT for Tien.');

select  * from supersayan;