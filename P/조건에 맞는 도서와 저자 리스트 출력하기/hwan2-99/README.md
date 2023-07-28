## :pushpin: **Algorithm**

- 조건에 맞는 도서와 저자 리스트 출력하기

## :round_pushpin: **Logic**

```sql
SELECT
    b.BOOK_ID AS BOOK_ID,
    a.AUTHOR_NAME AS AUTHOR_NAME,
    DATE_FORMAT(b.PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK b
         JOIN AUTHOR a
              ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE b.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE
;
```

- BOOK 테이블과 AUTHOR 테이블에서 저자_ID 를 기준으로 JOIN하여 해결 조건은 책의 카테고리를'경제' 인것으로

## :black_nib: **Review**

- 역시나 간단한 JOIN 문제

