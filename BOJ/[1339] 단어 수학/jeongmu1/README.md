# [1339] 단어 수학

## :pushpin: **Algorithm**

- 그리디 알고리즘

## :round_pushpin: **Logic**

 ```kotlin
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

val count = br.readLine().toInt()
val map = mutableMapOf<Char, Int>()

for (i in 0 until count) {
    val word = br.readLine()
    var length = word.length - 1

    word.forEach {
        val tmp = 10f.pow(length)

        if (map.contains(it)) {
            map[it] = map[it]!!.plus(tmp.toInt())
        } else {
            map[it] = tmp.toInt()
        }
        length--
    }
}

val list = map.toList().sortedByDescending { it.second }

var num = 9
var result = 0

for (i in 0 until map.size) {
    result += list[i].second * num--
}

bw.write(result.toString())

br.close()
bw.flush()
bw.close()
```

- 단어를 입력 받아 각각 인덱스 별로 몇 번 대입되었는지 카운트 하여 `Map`에 저장
- `Map`에 저장된 숫자대로 내림차순 정렬 후 9부터 숫자를 하나씩 부여하여 결과 도출

## :black_nib: **Review**

- 처음에는 단어들 중 단어길이가 가장 긴 단어의 앞자리부터 숫자를 하나씩 부여하는 것을 시도해 보았으나
```text
  11
  ABCD
  BCD
  BCD
  BCD
  BCD
  BCD
  BCD
  BCD
  BCD
  BCD
  BCD
```
- 과 같은 극단적인 상황에서는 원하지 않는 방식으로 작동하여 다른 접근법을 찾는 과정이 어려웠다.