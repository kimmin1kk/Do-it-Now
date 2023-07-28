# 이상현 문자 만들기

## :pushpin: **Algorithm**

- 배열과 반복문을 이용한 값 삽입

## :round_pushpin: **Logic**

```javascript
function solution(s) {
  const arr1 = s.split(" ");
  let arr2 = [];
  let answer = "";
  for (let i = 0; i < arr1.length; i++) {
    if (i !== 0) {
      answer += " ";
    }
    arr2 = [...arr1[i]];
    for (let j = 0; j < arr2.length; j++) {
      j % 2 === 0
        ? (answer += arr2[j].toUpperCase())
        : (answer += arr2[j].toLowerCase());
    }
  }
  console.log(answer);
  return answer;
}
```

- 입력받은 배열에 외부 반복문을 돌고 이차원 배열을 만든다.
- 이차원 배열에서 내부 반복문을 돌고 짝수 면 대문자로 바꿔서 answer에 값을 더하고 아니면 소문자로 바꿔서 answer에 값을 더한다.

## :black_nib: **Review**

- 예시에는 소문자만 입력되는 것으로 보였는데 대문자도 입력되는 경우를 생각하는데 시간이 조금 걸렸다.
