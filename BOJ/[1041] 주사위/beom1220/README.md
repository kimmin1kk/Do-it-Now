# [1041] 주사위

---

## 📌 **Algorithm**

---

그리디 알고리즘

## 📍 **Logic**

---

```
public static int getMin(List<Integer> list) {
    int min = list.get(0);
    for (int num: list) {
        if (num < min) {
            min = num;
        }
    }
    return min;
}

// 접하는 2개의 면의 합 중 최솟값 구하기
public static int getDoubleMin() {
    int sum;
    List<Integer> list = new ArrayList<>();
    sum = nums.get(0) + nums.get(1);
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            if ((i != j) && (i + j != 5)) {
                sum = nums.get(i) + nums.get(j);
                list.add(sum);
            }
        }
    }
    return getMin(list);
}

  // 접하는 3개의 면의 합 중 최솟값 구하기
public static int getTripleMin() {
    int sum;
    List<Integer> list = new ArrayList<>();
    sum = nums.get(0) + nums.get(1) + nums.get(2);
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 6; k++) {
                if ((i != j) && (j != k) && (i != k)
										&& (i + j != 5) && (j + k != 5) && (i + k != 5)) {
                    sum = nums.get(i) + nums.get(j) + nums.get(k);
                    list.add(sum);
                }
            }
        }
    }
    return getMin(list);
}

private static void getResult() {
    //주사위가 하나일 때는 가장 높은 면 제외한 5개 면의 합.
    if (n == 1) {
        for (int num : nums) {
            result += num;
        }
        result -= getMax(nums);
        System.out.println(result);
    } else { // 외에는 규칙에 따름.
        one = getMin(nums);
        doub = getDoubleMin();
        trip = getTripleMin();
        result = ((4 * trip) + ((8*n-12) * doub)
									+ ((((long) Math.pow(n, 2)) * 5 - 16*n + 12) * one));
        System.out.println(result);
    }
}
```

- 각 기준에 따른 최솟값을 구한다. (1면, 2면, 3면)
- 각 최솟값을 수학적 규칙에 따라 합한다.

## ✒️ **Review**

---

- 문제 풀이 자체는 흔한 그리디 알고리즘이라 금방 풀 수 있었다.
- 처음에는 int로만 코드를 작성했더니 오버플로우가 발생했다.
- 간단하게 필요한 부분만 long으로 바꿨는데, Math.pow 값을 여전히 int로 캐스팅해둔 걸 못 찾아서 조금 지연됐다.