-- books
CREATE TABLE IF NOT EXISTS books (
    book_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(13) NOT NULL UNIQUE,
    author VARCHAR(100) NOT NULL,
    publisher VARCHAR(100),
    price DECIMAL(7,2),
    date_published DATE DEFAULT (CURRENT_DATE)
);