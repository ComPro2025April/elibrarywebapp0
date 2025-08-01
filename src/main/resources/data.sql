-- books data
DELETE from books where 1=1;

INSERT INTO books (title, isbn, author, publisher, price, date_published)
VALUES
    ('Patterns of Enterprise Application Architecture', '978-112309971', 'Martin Fowler', 'McGraw-Hill', '45.95', '2001-11-15'),
    ('Core Java - Volume I Fundamentals', '978-112302600', 'Cay Horstmann', 'Addison Wesley', '39.99', '2015-1-26'),
    ('Database Design', '978-112309001', 'Sarah J. Lowery', 'Apress', '20.49', '2000-2-29');
