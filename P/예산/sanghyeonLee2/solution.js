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
