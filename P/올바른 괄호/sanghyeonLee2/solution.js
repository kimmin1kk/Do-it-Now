function solution(s) {
  let array = [...s];
  let cnt = 0;
  let answer = true;

  for (let i = 0; i < array.length; i++) {
    array[i] === "(" ? cnt++ : cnt--;
    if (cnt < 0) {
      break;
    }
  }
  if (cnt !== 0) {
    answer = false;
  }

  return answer;
}
