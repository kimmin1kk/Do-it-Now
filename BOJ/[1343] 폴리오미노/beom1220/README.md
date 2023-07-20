# [1343] 폴리오미노

---

## 📌 **Algorithm**

---

그리디 알고리즘

## 📍 **Logic**

---

```
String input = sc.nextLine();

String[] result = input.split("\\.");
for (String r : result) {
    if (r.length() % 2 != 0) {
        System.out.println(-1);
        System.exit(0);
    }
}
input = input.replace("XXXX", "AAAA");
input = input.replace("XX", "BB");

System.out.println(input);
```

- 우선 . 을 기준으로 입력값을 나눈다.
- 나눠진 값 중 길이가 홀수인 것이 있다면 -1을 출력하고 프로그램을 종료한다.
- 없는 경우에는 먼저 XXXX를 AAAA로 치환하고, 이후 남은 걸 BB로 치환한다.

## ✒️ **Review**

---

- 문제 자체는 그리 어렵지 않았다.
- 오히려 정규표현식 때문에 어려웠던 문제였는데, 중간에 있는 . 같은 경우에는 출력을 구현하기 어렵지 않았는데, 맨 뒤에 붙은 경우가 애매했다. ex) ..XX…XXXX…
- 그래서 처음에는 정규표현식을 검색해보고 찾아가면서 복잡하게 풀었다.
- 그러다가 replace가 늦게서야 생각나서 로직을 바꿨더니 훨씬 간단하게 풀 수 있었다.
- replace로 풀고나니 그리디 알고리즘을 내가 직접 적는 게 아니라 replace가 알아서 해주는 느낌이긴 한데, 어쨌든 훨씬 쉽고 간단히 풀 수 있었다.
- 아래는 처음에 풀었던 쓸데없이 복잡한 코드.
- ```
    public static void main(String[] args) {
        String input = sc.nextLine();
        String[] peices = input.split("(?<=\\.)|(?=\\.)");

        List<Integer> pLen = new ArrayList<>();

        for (String p : peices) {
            if (!p.equals(".")) {
                if (p.length() % 2 != 0) {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
            pLen.add(p.length());
        }

        for (int i = 0; i < pLen.size(); i++) {
            int num = pLen.get(i);
            if (num == 1) {
                System.out.print(".");
                continue;
            }
            while (num != 0) {
                if (num >= 4) {
                    System.out.print("AAAA");
                    num -= 4;
                } else if (num == 2) {
                    System.out.print("BB");
                    num -= 2;
                }
            }
        }
    }
```