DROP TABLE IF EXISTS dog;
CREATE TABLE IF NOT EXISTS dog
(
    id                 BIGINT AUTO_INCREMENT,
    name               VARCHAR(50),
    picture_url        VARCHAR(50),
    short_description  VARCHAR(50),
    detail_description VARCHAR(50),
    vote_number        BIGINT,
    created_date       DATETIME,
    last_modified_date DATETIME,
    PRIMARY KEY (id)
) ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;

INSERT INTO dog(name, picture_url, short_description, detail_description, vote_number, created_date, last_modified_date)
values ('두두', 'https://example.com/1.jpg', '강아지 두두', '두두를 소개합니다', 20, '2023-05-21 10:00:00', '2023-05-21 10:00:00'),
       ('베리', 'https://example.com/2.jpg', '강아지 베리', '베리를 소개합니다', 10, '2023-05-01 10:00:00', '2023-05-01 10:00:00'),
       ('초코', 'https://example.com/3.jpg', '강아지 초코', '초코를 소개합니다', 5, '2023-05-02 11:00:00' , '2023-05-02 11:00:00'),
       ('샌디', 'https://example.com/4.jpg', '강아지 샌디', '샌디를 소개합니다', 8, '2023-05-03 12:00:00', '2023-05-03 12:00:00'),
       ('버거', 'https://example.com/5.jpg', '강아지 버거', '버거를 소개합니다', 12, '2023-05-04 13:00:00', '2023-05-04 13:00:00'),
       ('뭉치', 'https://example.com/6.jpg', '강아지 뭉치', '뭉치를 소개합니다', 7, '2023-05-05 14:00:00', '2023-05-05 14:00:00'),
       ('소금', 'https://example.com/7.jpg', '강아지 소금', '소금이를 소개합니다', 9, '2023-05-06 15:00:00', '2023-05-06 15:00:00'),
       ('백구', 'https://example.com/8.jpg', '강아지 백구', '백구를 소개합니다', 11, '2023-05-07 16:00:00', '2023-05-07 16:00:00'),
       ('슈가', 'https://example.com/9.jpg', '강아지 슈가', '슈가를 소개합니다', 6, '2023-05-08 17:00:00', '2023-05-08 17:00:00'),
       ('봉구', 'https://example.com/10.jpg', '강아지 봉구', '봉구를 소개합니다', 10, '2023-05-09 18:00:00', '2023-05-09 18:00:00'),
       ('해피', 'https://example.com/11.jpg', '강아지 해피', '해피를 소개합니다', 8, '2023-05-10 19:00:00' , '2023-05-10 19:00:00'),
       ('영지', 'https://example.com/12.jpg', '강아지 영지', '영지를 소개합니다', 7, '2023-05-11 20:00:00', '2023-05-11 20:00:00'),
       ('키티', 'https://example.com/13.jpg', '강아지 키티', '키티를 소개합니다', 9, '2023-05-12 20:00:00', '2023-05-12 20:00:00');
