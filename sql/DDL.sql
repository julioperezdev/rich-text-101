CREATE TABLE post(
                     id INT PRIMARY KEY IDENTITY (1,1),
                     title VARCHAR(200) NOT NULL,
                     numberClass INT NOT NULL UNIQUE,
                     text VARCHAR(MAX) NOT NULL
)

CREATE PROCEDURE createPost
    @Title VARCHAR(200),
    @NumberClass INT,
    @Text VARCHAR(MAX)
    AS
    INSERT INTO POST (title, numberClass, text )
    VALUES( @Title, @NumberClass , @Text)
SELECT TOP 1 * FROM post order by id DESC
    GO;