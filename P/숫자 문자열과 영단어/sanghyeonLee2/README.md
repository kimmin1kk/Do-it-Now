# 숫자 문자열과 영단어

## :pushpin: **Algorithm**

- 반복문, 배열
- 임시 변수에 값 할당

## :round_pushpin: **Logic**

```javascript
function solution(s) {
  let arr = [...s];
  let str = "";
  let tmpStr = "";
  const num = [
    "zero",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
  ];
  for (let i = 0; i < arr.length; i++) {
    if (isNaN(arr[i]) === false) {
      str += arr[i];
      continue;
    }
    tmpStr += arr[i];
    let tmp = num.findIndex((e) => e === tmpStr);
    if (tmp !== -1) {
      str += tmp;
      tmpStr = "";
    }
  }
  var answer = Number(str);
  return answer;
}
```

- 문자열을 배열로 변환시킨다.
- 배열에 반복문을 사용하고 안에서 값이 숫자인지 판별한다.
- 정수형이면 문자열 변수에 값을 더하고 아니면 반복문을 한번 스킵한다.
- 임시저장 문자열 변수에 값을 저장한다.
- 다른 임시저장 변수에 알바벳 순서을 저장시키기 위해 알파벳 순서에 맞는 인덱스 값을 저장한다.
- 그 값을 다시 문자열에 더하고 임시저장 문자열 변수를 초기화 시킨다.

## :black_nib: **Review**

- 변수를 많이 선언한 거 같았지만 시간 초과가 나오지 않았다. 로직을 더욱 짧고 간결하게 작성하는 연습을 해야할 것 같다.
