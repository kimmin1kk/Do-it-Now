# [1764] 듣보잡

---

## 📌 **Algorithm**

---

자료 구조

## 📍 **Logic**

---

```
for (int i = 0; i < n + m; i++) {
    newMan = sc.nextLine();
    if (!set.add(newMan)) {
        both++;
        bothList.add(newMan);
    }
}
Collections.sort(bothList);
System.out.println(both);
for (String man : bothList) {
    System.out.println(man);
}
```

- 해시 셋에는 중복값이 들어갈 수 없고, add할 때 값의 존재여부로 boolean 값을 반환한다.
- 이를 이용하여 해시 셋에 값을 입력하다가, 이미 존재할 때마다 bothList에 추가한다.

## ✒️ **Review**

---

- 처음에는 리스트만을 이용해서 풀었으나, 시간 초과가 발생했다.
- 리스트를 사용했을 때는 더 이상 for문도 줄일 수 없었기 때문에 고민이 길어졌다.
- 중복을 허용하지 않는 자료 구조를 이용해야 할 것 같아서 해시 셋을 찾아서 사용했다.
- 이름을 정렬해서 출력해야 한다는 점을 안 읽었어서 해시 셋을 쓰고도 틀렸을 때 당황스러웠지만, 다행히 문제점을 금방 발견했다.