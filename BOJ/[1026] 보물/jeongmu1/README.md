# [1026] 보물

## :pushpin: **Algorithm**

- 그리디 알고리즘

## :round_pushpin: **Logic**

```kotlin
val br = BufferedReader(InputStreamReader(System.`in`))
    val size = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }.sortedDescending()
    val b = br.readLine().split(" ").map { it.toInt() }.sorted()
    br.close()

    var result = 1
    for (i in 1 until size) {
        result += a[i] * b[i]
    }

    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(result.toString())
    bw.flush()
    bw.close()
```

- a를 내림차순으로 정렬하고, b를 내림차순으로 정렬하여 N만큼 돌며 같은 index끼리 곱한 후 result에 더한다.

## :black_nib: **Review**
- 난이도가 너무 쉬운 문제를 골랐다