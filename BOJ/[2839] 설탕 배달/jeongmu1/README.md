# [2839] 설탕 배달

## :pushpin: **Algorithm**

- 그리디 알고리즘

## :round_pushpin: **Logic**

 ```kotlin
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

val input = br.readLine().toInt()

val results = ArrayList<Pair<Int, Int>>()
var countOfFive = 0
var countOfThree = 1

while ((countOfFive * 5) <= input) {
    while (countOfThree * 3 + countOfFive * 5 <= input) {
        if (countOfThree * 3 + countOfFive * 5 == input) {
            results.add(Pair(countOfFive, countOfThree))
        }
        countOfThree++
    }
    countOfThree = 0
    countOfFive++
}

if (results.isNotEmpty()) {
    val result = results.maxBy { it.first }
    bw.write((result.first + result.second).toString())
} else {
    bw.write((-1).toString())
}

br.close()
bw.flush()
bw.close()
```

- 3kg, 5kg 봉지들을 합한 값이 `input`의 값보다 커지기 전 까지 모든 경우의 수를 대입해보며 반복한다.
- 3kg, 5kg 봉지들을 합한 값이 만약 `input`값과 같으면 `results`에 저장해 둔다
- `results`에 저장된 값들 중 5kg 봉지가 가장 많은 값을 찾아 출력한다. 만약 `results`가 비어 있는 경우는 `-1`을 출력한다.

## :black_nib: **Review**

- 노트에 적어보며 해보니 정말 쉬운 문제였다.