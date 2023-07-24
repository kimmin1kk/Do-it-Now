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
