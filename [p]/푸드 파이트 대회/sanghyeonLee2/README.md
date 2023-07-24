# [134240]

## :pushpin: **Algorithm**

- 배열과 반복문을 이용한 값 삽입

## :round_pushpin: **Logic**

```javascript
function solution(food) {
  var arr = [0];
  for (let i = food.length - 1; 0 <= i; i--) {
    // 배열 인덱스가 클수록 칼로리가 높기 때문에 뒤에서 부터 반복문 시작
    if (food[i] !== 1) {
      // 음식 수가 1이면 삽입을 못한다
      let num = parseInt(food[i] / 2);
      while (num >= 1) {
        arr.unshift(food.lastIndexOf(food[i]));
        // 앞에서 삽입
        arr.push(food.lastIndexOf(food[i]));
        // 뒤에서 삽입
        num -= 1;
      }
      food.splice(food.lastIndexOf(food[i]), 1);
      // 값이 중복될 수 있으므로 배열에서 값을 없앤다
    }
  }

  const answer = arr.join("");

  console.log(answer);

  return answer;
}
solution([1, 7, 1, 2]);
```

- 배열의 인덱스가 칼로리 이기 때문에 반복문에 큰 수 부터 접근한다.
- 음식 수가 1이면 삽입을 못하게 한다.
- num >= 1 일때 동안 배열의 값을 2로 나눈 몫을 앞, 뒤로 삽입한다.
- 배열을 문자열로 변환한다.

## :black_nib: **Review**

- 반복문 들여쓰기가 많지만 통과 되었다.
