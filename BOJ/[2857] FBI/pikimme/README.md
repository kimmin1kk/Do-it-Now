# [2857] FBI

---

## 📌 **Algorithm**

---

구현 / 문자열 알고리즘

## 📍 **Logic**

---

```
Scanner sc = new Scanner(System.in);
String[] arr = new String[5];
int n = 0;
int m = 0;

for(int i = 0; i <= 4; i++) { //5번 연속 입력 받기 위한 반복문
    String input = sc.nextLine();
    if (input.contains("FBI")) {
        arr[i] = Integer.toString(i + 1); //입력값에 FBI가 포함 되면 i번째 입력값임을 확인하기 위함
    } else {
        arr[i] = null; //입력값에 FBI가 포함 되지 않으면 null
    }
}
for(int j = 0; j <= 4; j++) {
    if (n == 3 && j == 3 && arr[j] == null) { //모든 입력값에 FBI가 포함되지 않을 경우
        System.out.println("HE GOT AWAY!");
    } else if (arr[j] == null) {
        n = n + 1; //null이 몇 번 들어갔는지 확인하기 위함
    } else { //arr배열의 j번째가 null이 아닐 경우
        if (m != 0) {
            System.out.print(" ");
        }
        System.out.print(arr[j]);
        m = m + 1; //FBI가 해당하는 번째 중 사이에 null이 존재할 경우 띄어쓰기로 구분하기 위함
    }
}
```

- 입력값 중 문자열 FBI가 포함하는지 확인하는 작업을 5번 반복한다.
- 문자열 FBI가 포함되는 입력값이 몇 번째의 입력값인지 순서를 출력하고 여러 개일 경우 띄어쓰기로 구분한다.
- 5번의 입력값 모두 문자열 FBI가 포함되지 않으면 "HE GOT AWAY!"를 출력한다.

## ✒️ **Review**

---

- 문제 해결에 대한 해답은 빠르게 생각하였지만 좀 더 정돈된 로직을 생각하지 못해 아쉽다.