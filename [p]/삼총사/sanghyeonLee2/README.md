# [131705]

## :pushpin: **Algorithm**

- 반복문, 배열을 이용한 값 삽입

## :round_pushpin: **Logic**

```javascript
function solution(number) {
  let cnt = 0;
  for (let i = 0; i <= number.length - 1; i++) {
    for (let j = i + 1; j <= number.length - 1; j++) {
      for (let k = j + 1; k <= number.length - 1; k++) {
        if (number[i] + number[j] + number[k] === 0) {
          cnt++;
          //반복문을 돌면서 모든 값을 비교 가능
        }
      }
    }
  }
  console.log(cnt);
  return cnt;
}

solution([-2, 3, 0, 2, -5]);
```

- 4중첩 for문을 사용후 조건문으로 조건에 맞을때 cnt값을 증가시킨다.

## :black_nib: **Review**

- 시간 초과가 되지 않아 생각보다 쉽게 작성했다.
