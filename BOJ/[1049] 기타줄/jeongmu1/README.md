# [1049] 기타줄

## :pushpin: **Algorithm**

- 그리디 알고리즘

## :round_pushpin: **Logic**

```kotlin
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

val counts = br.readLine().split(" ")
var stringCount = counts[0].toInt()
val brandCount = counts[1].toInt()

val list = mutableListOf<Pair<Int, Int>>()
for (i in 0 until brandCount) {
    val input = br.readLine().split(" ")
    list.add(Pair(input[0].toInt(), input[1].toInt()))
}

var result = 0

val setMin = list.minBy { it.first }.first
val oneMin = list.minBy { it.second }.second
val sixMin = if ((oneMin * 6) < setMin) oneMin * 6 else setMin

result += (stringCount / 6) * sixMin
stringCount %= 6

result += if ((oneMin * stringCount) < setMin) {
    oneMin * stringCount
} else {
    setMin
}

bw.write(result.toString())

br.close()
bw.flush()
bw.close()
```

- 6으로 뺄 수 있는 데 까지 한 패키지와 낱개 6개 중 더 작은 수로 필요한 기타 줄에서 뺀다.
- 빼고 남은 6개 미만의 기타줄을 살 때 패키지로 6개사는 것이 비용이 덜 발생할 지, 아니면 낱개로 정량만 사야 비용이 덜 발생할 지 계산하여 총 비용에 더한 후 출력한다.

## :black_nib: **Review**
- 처음에는 6으로 뺄 수 있는 데 까지 뺄 때 무조건 패키지로만 계산하였으나 실패하여, 낱개 6개 가격과 패키지 1개의 가격도 비교하면서 접근하였다.
- 예외 상황도 좀 더 자세히 봐야겠다고 느꼈다.
