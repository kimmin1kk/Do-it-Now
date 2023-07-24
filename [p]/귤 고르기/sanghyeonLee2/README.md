# [138476]

## :pushpin: **Algorithm**

- reduce를 사용한 누산값 계산

## :round_pushpin: **Logic**

```javascript
function solution(d, budget) {
  let cnt = 0;
  d.sort((a, b) => a - b).reduce((acc, cur, idx, arr) => {
    //누산값을 사용하기 위함
    if (acc + cur > budget) {
      return arr.splice(1);
      //reduce중단
    }
    cnt += 1;

    return acc + cur;
  }, 0);
  console.log(cnt);

  return cnt;
}

solution([1, 3, 2, 5, 4], 9);
```

- 배열 값을 오름차순으로 정렬 후 reduce로 누산값을 계산하면서 cnt값을 증가시킨다.
- 누산값이 budjet값보다 크면 reduce를 중단한다.

## :black_nib: **Review**

- reduce에 익숙하지 않아서 구글링을 하면서 작성했다.
