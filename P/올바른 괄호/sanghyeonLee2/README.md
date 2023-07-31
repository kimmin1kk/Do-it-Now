# 올바른 괄호

## :pushpin: **Algorithm**

- 반복문, 배열을 이용한 값 삽입

## :round_pushpin: **Logic**

```javascript
function solution(s) {
  let array = [...s];
  let cnt = 0;
  let answer = true;

  for (let i = 0; i < array.length; i++) {
    array[i] === "(" ? cnt++ : cnt--;
    if (cnt < 0) {
      break;
    }
  }
  if (cnt !== 0) {
    answer = false;
  }

  return answer;
}
```

- 값을 배열로 바꾼 후 괄호 방향에 따라 조건문을 추가해 cnt값을 조건에 맞게 증감한다.

## :black_nib: **Review**

- 어려움 없이 쉽게 작성하였다.
