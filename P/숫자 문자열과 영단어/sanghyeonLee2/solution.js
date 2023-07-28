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

solution("one4seveneight");
