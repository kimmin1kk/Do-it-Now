# [178871]

## :pushpin: **Algorithm**

- Map, 반복문, 배열을 이용한 값 삽입

## :round_pushpin: **Logic**

```javascript
function solution(players, callings) {
  const playersMap = new Map();
  //시간복잡도 줄이기 위해 선수 Map 생성

  players.forEach((element, idx) => {
    playersMap.set(element, idx);
  }); //element를 키, index를 value값으로 저장

  for (let i = 0; i < callings.length; i++) {
    const idx = playersMap.get(callings[i]);
    if (idx > 0) {
      //1등이면 등수를 못 바꾸기 떄문
      const tmp = players[idx - 1];
      //등수 임시저장소
      players[idx - 1] = callings[i];
      players[idx] = tmp;

      playersMap.set(tmp, idx);
      playersMap.set(callings[i], idx - 1);
      //등수 바꾸기
    }
  }

  return players;
}
solution(["mumu", "soe", "poe", "kai", "mine"], ["kai", "kai", "mine", "mine"]);
```

- 배열을 통한 반복문으로 Map에 key값과 value값을 삽입한다.
- 반복문, Map과 임시 변수 tmp를 통해 배열에 접근해서 값을 교체한다.

## :black_nib: **Review**

- Map 사용법에 대해서 조금 익숙해지게 되었다.
