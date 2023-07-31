function solution(s, n) {
    let str = "";
    let arr = [...s];
  
    const upper = Array.from({ length: 26 }, (v, i) =>
      String.fromCharCode(i + 65)
    );
    const low = Array.from({ length: 26 }, (v, i) => String.fromCharCode(i + 97));
  
    for (let i = 0; i < arr.length; i++) {
      //참이면 대문자 거짓이면 소문자
      if (arr[i] === " ") {
        str += " ";
        continue;
      }
      if (arr[i] === arr[i].toUpperCase()) {
        let UIdx = upper.findIndex((e) => e === arr[i]);
        str += upper[UIdx + n > 25 ? UIdx + n - 26 : UIdx + n];
      } else {
        let lIdx = low.findIndex((e) => e === arr[i]);
        str += low[lIdx + n > 25 ? lIdx + n - 26 : lIdx + n];
      }
    }
  
    return str;
  }