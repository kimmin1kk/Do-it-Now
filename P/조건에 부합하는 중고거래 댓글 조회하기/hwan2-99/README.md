## :pushpin: **Algorithm**

- 조건에 부합하는 중고거래 댓글 조회하기

## :round_pushpin: **Logic**

```sql
SELECT TITLE, BOARD.BOARD_ID, REPLY_ID, REPLY.WRITER_ID, REPLY.CONTENTS, DATE_FORMAT(REPLY.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_REPLY AS REPLY
         INNER JOIN USED_GOODS_BOARD AS BOARD
                    ON REPLY.BOARD_ID=BOARD.BOARD_ID
WHERE DATE_FORMAT(BOARD.CREATED_DATE, '%Y-%m') = '2022-10'
ORDER BY REPLY.CREATED_DATE, TITLE
```

- BOARD 테이블과 REPLY 테이블에서 원하는 컬럼을 가져와 JOIN 하여 오름차순으로 정렬하고 날짜는 문제에서 지정해준대로 포맷해준다.

## :black_nib: **Review**

- 기초적인 JOIN과 날짜 포맷팅을 사용하는 문제이다.
