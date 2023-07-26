# [1213] 팰린드롬 만들기

---

## 📌 **Algorithm**

---

그리디 알고리즘

## 📍 **Logic**

---

```
List<List<String>> div = new ArrayList<>();
String pre = list.get(0);
List<String> temp = new ArrayList<>();
temp.add(pre);

for (int i = 1; i < list.size(); i++) {
    if (!pre.equals(list.get(i))) {
        div.add(temp);
        temp = new ArrayList<>();
        pre = list.get(i);
        temp.add(pre);
    } else {
        temp.add(pre);
    }
}
div.add(temp);
```

- 입력받은 문자열을 정렬한 후에, 위의 코드를 통해 이차원 배열에 문자별로 나누었다.
- 맨 앞의 값을 pre에 넣어두고 시작하여, 다음부터는 이전의 문자와 같은 문자인지 검사.
- 같다면 같은 배열에 넣고, 아니라면 이전 배열을 끝내고 새 배열을 만들어 넣는다.
- 위 코드 이후에는 간단한 검사 후 출력을 진행했다.

## ✒️ **Review**

---

- 전체 코드는 생각했던 로직 그대로를 구현해뒀다.
- 직관적으로 떠오른 방법 그대로 코드로 구현했다보니 엄청 깔끔하고 간략한 코드가 안 나와서 아쉽긴 했다.