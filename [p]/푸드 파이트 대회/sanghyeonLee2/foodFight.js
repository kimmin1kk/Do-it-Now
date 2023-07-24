function solution(food) {
  var arr = [0];
  for (let i = food.length - 1; 0 <= i; i--) {
    // 배열 인덱스가 클수록 칼로리가 높기 때문에 뒤에서 부터 반복문 시작
    if (food[i] !== 1) {
      // 음식 수가 1이면 삽입을 못한다
      let num = parseInt(food[i] / 2);
      while (num >= 1) {
        arr.unshift(food.lastIndexOf(food[i]));
        // 앞에서 삽입
        arr.push(food.lastIndexOf(food[i]));
        // 뒤에서 삽입
        num -= 1;
      }
      food.splice(food.lastIndexOf(food[i]), 1);
      // 값이 중복될 수 있으므로 배열에서 값을 없앤다
    }
  }

  const answer = arr.join("");

  console.log(answer);

  return answer;
}
solution([1, 7, 1, 2]);
