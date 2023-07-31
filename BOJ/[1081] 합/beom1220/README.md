# [1081] 합

---

## 📌 **Algorithm**

---

수학

## 📍 **Logic**

---

```
for (long i = 0; Math.pow(10, i) <= num; i++) {
    // 0-9가 완성된 조합의 합
    unit = num / (long) Math.pow(10, i+1);
    result += unit * 45 * (long) Math.pow(10, i);

    // 완성되지 않은 조합의 합
    remainder = num % (long) Math.pow(10, i+1);
    remainder /= (long) Math.pow(10, i);

    remSum = 0;
    if (i == 0) {
        for (int j = 1; j <= remainder; j++) {
            remSum += j;
        }
    } else {
        for (int j = 1; j < remainder; j++) {
            remSum += j;
        }
        remSum *= (long) Math.pow(10, i);
        remSum += ((num % (long) Math.pow(10, i)) + 1) * remainder;
    }
    result += remSum;
}
```

- 0-9까지의 합은 45이다.
- 각 자릿수마다 0-9가 완성된 개수를 구해서 45를 곱해서 더한다.
- 0-9가 완성되지 않은 경우에는 각 숫자마다 있는 개수를 구해서 더한다.
- u까지의 총합을 먼저 구하고, l-1까지의 총합을 구해서 빼면 끝.

## ✒️ **Review**

---

- 당연히 문제를 단순히 텍스트 그대로 풀면 범위가 20억까지라 시간초과가 나올 수 밖에 없다.
- 공식을 구하는 과정에서 숫자들이 너무 이것저것 나와서 많이 헷갈렸다.
- 위 방식으로의 접근은 바로 했지만, 공식 도출에 많은 시간을 할애했다.
- 머리아프다.