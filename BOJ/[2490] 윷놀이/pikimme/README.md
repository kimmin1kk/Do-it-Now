# [2490] 윷놀이

---

## 📌 **Algorithm**

---

구현 알고리즘

## 📍 **Logic**

---

```
Scanner sc = new Scanner(System.in);
int[][] arr = new int[3][4]; //3번의 입력을 한 번에 받기 위해 2차원 배열 선언

for(int i = 0; i <= 2; i++) { //3번 연속 입력 받기 위한 반복문
    String input = sc.nextLine();
    String[] scan = input.split(" "); //한 줄을 입력 값으로 받고 띄어쓰기를 제외 시켜 숫자만 배열에 넣음
    
    for(int j = 0; j <= 3; j++) {
        arr[i][j] = Integer.parseInt(scan[j]); //문자열 값을 정수형으로 변환 시킴
    }
}
for(int[] n : arr) {
    int zero = 0;
    for(int m : n) { //배열을 돌면서 0의 수를 구함
        if (m == 0) {
            zero = zero + 1;
        }
    }
    switch (zero) { //0의 수에 따라 결과 출력
        case 1: //도
            System.out.println("A");
            break;
        case 2: //개
            System.out.println("B");
            break;
        case 3: //걸
            System.out.println("C");
            break;
        case 4: //윷
            System.out.println("D");
            break;
        case 0: //모
            System.out.println("E");
            break;
    }
}        
```

- 3번의 입력 값을 받아 윷의 배(0)의 수를 구한다.
- 0의 수에 따라 도(A), 개(B), 걸(C), 윷(D), 모(E)를 출력한다.

## ✒️ **Review**

---

- 기본적으로 쉬운 문제였으나 예제 형식을 잘못 이해한 상태로 진행하여 오답을 많이 제출하였다.
- 문제를 꼼꼼히 읽는 습관이 필요할 거 같다.