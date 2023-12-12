DROP TABLE IF EXISTS Book;
CREATE TABLE Book (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      title VARCHAR(255) NOT NULL,
                      author VARCHAR(255) NOT NULL,
                      isbn VARCHAR(13) NOT NULL,
                      publication_date DATE NOT NULL
);
