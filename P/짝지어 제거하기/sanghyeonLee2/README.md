# 짝지어 제거하기

## :pushpin: **Algorithm**

- 반복문, 배열을 이용한 값 삽입
- 스택

## :round_pushpin: **Logic**

```javascript
function solution(s) {
  const st = [];

  for (const c of s) {
    if (st.length > 0 && st[st.length - 1] === c) {
      st.pop();
    } else {
      st.push(c);
    }
  }

  return st.length === 0 ? 1 : 0;
}
```

- 입력받은 배열에서 반복문으로 값을 판단하여 스택형식으로 새 배열에 push해준다
- push한 값과 입력받은 배열의 값을 비교해 맞으면 그 값을 pop한다.

## :black_nib: **Review**

- 시간초과를 막기위해 코드를 간단하게 수정하는 과정이 생각보다 시간이 걸렸다.
