function solution(number) {
  let cnt = 0;
  for (let i = 0; i <= number.length - 1; i++) {
    for (let j = i + 1; j <= number.length - 1; j++) {
      for (let k = j + 1; k <= number.length - 1; k++) {
        if (number[i] + number[j] + number[k] === 0) {
          cnt++;
          //반복문을 돌면서 모든 값을 비교 가능
        }
      }
    }
  }
  console.log(cnt);
  return cnt;
}

solution([-2, 3, 0, 2, -5]);
