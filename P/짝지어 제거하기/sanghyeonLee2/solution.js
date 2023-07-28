function solution(s) {
  const st = [];

  for (const c of s) {
    if (st.length > 0 && st[st.length - 1] === c) {
      st.pop();
    } else {
      st.push(c);
    }
  }

  return st.length === 0 ? 1 : 0;
}
