function solution(s) {
    const arr1 = s.split(" ");
    let arr2 = [];
    let answer = "";
    for (let i = 0; i < arr1.length; i++) {
      if (i !== 0) {
        answer += " ";
      }
      arr2 = [...arr1[i]];
      for (let j = 0; j < arr2.length; j++) {
        j % 2 === 0
          ? (answer += arr2[j].toUpperCase())
          : (answer += arr2[j].toLowerCase());
      }
    }
    console.log(answer);
    return answer;
  }