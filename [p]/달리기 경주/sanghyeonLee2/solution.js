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
