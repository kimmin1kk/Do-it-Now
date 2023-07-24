# [12982]

## :pushpin: **Algorithm**

- Map, 반복문, 배열을 이용한 값 삽입

## :round_pushpin: **Logic**

```javascript
function solution(k, tangerine) {
  let same = 0;

  const tangMap = new Map();

  for (const ele of tangerine) {
    same = (tangMap.get(ele) || 0) + 1;
    // || : 왼쪽값이 true이면 그 값이되고 오른쪽 값은 보지도 않는다. false이면 왼쪽값이 된다
    tangMap.set(ele, same);
    // ele(key: value) => same(value: 배열내에 값이 같은 수) 어런식으로 저장됨
  }
  console.log(tangMap);

  const arr2 = [...tangMap.entries()].sort((a, b) => b[1] - a[1]);
  // 2차원배열로 저장되기 때문[1] 가 붙음, 내림차순 정렬

  let val = 0;

  for (const ele of arr2) {
    k -= ele[1];
    // 입력된 k 값을 배열 값(귤 개수)만큼 뺀다
    val += 1;
    // 최대값 증가
    if (k <= 0) {
      break;
      // k값이 0보다 작게되면 반복문을 멈춘다
    }
  }

  return val;
}
solution(6, [1, 3, 2, 5, 4, 5, 2, 3]);
```

- 배열을 통한 반복문으로 Map에 key값과 value값을 삽입한다.
- Map을 다시 2차원 배열로 변환하고 두번째 열의 값을 기준으로 정렬한다.
- 작은 수 부터 접근해야 하기 때문에 내림차순으로 정렬한다.
- 정렬된 2차원 배열에 반복문으로 접근해서 k값을 감소 시킨다.
- k값이 0보다 작으면 반복문을 종료한다.

## :black_nib: **Review**

- 시간 초과를 없애기 위해 Map을 배열로 변환하는 과정에서 시행착오를 겪었다.
