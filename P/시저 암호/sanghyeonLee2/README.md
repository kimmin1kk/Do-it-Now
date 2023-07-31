# 시저 암호

## :pushpin: **Algorithm**

- 배열과 반복문을 이용한 값 삽입

## :round_pushpin: **Logic**

```javascript
function solution(s, n) {
  let str = "";
  let arr = [...s];

  const upper = Array.from({ length: 26 }, (v, i) =>
    String.fromCharCode(i + 65)
  );
  const low = Array.from({ length: 26 }, (v, i) => String.fromCharCode(i + 97));

  for (let i = 0; i < arr.length; i++) {
    //참이면 대문자 거짓이면 소문자
    if (arr[i] === " ") {
      str += " ";
      continue;
    }
    if (arr[i] === arr[i].toUpperCase()) {
      let UIdx = upper.findIndex((e) => e === arr[i]);
      str += upper[UIdx + n > 25 ? UIdx + n - 26 : UIdx + n];
    } else {
      let lIdx = low.findIndex((e) => e === arr[i]);
      str += low[lIdx + n > 25 ? lIdx + n - 26 : lIdx + n];
    }
  }

  return str;
}
```

- 구글링을 통해 알파벳 대문자, 소문자를 순서대로 각각의 배열에 값을 삽입한다.
- 반복문을 돌면서 대소문자를 판별하고 알파벳 유형에 따라 str에 입력받은 n만큼 앞에있는 알파벳을 str에 더한다.

## :black_nib: **Review**

- z 다음에 a로 시작하는 부분에서 조금 고민했지만 대체적으로 쉽게 작성했다.
