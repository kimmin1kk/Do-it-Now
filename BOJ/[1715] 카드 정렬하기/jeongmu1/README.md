# [1715] 카드 정렬하기

## :pushpin: **Algorithm**

- 그리디 알고리즘
- 우선순위 큐

## :round_pushpin: **Logic**

 ```kotlin
val br = BufferedReader(InputStreamReader(System.`in`))
val bw = BufferedWriter(OutputStreamWriter(System.out))

val n = br.readLine()!!.toInt()
val priorityQueue = PriorityQueue<Int>()

for (i in 1..n) {
    priorityQueue.offer(br.readLine()!!.toInt())
}

var answer = 0
while (priorityQueue.size > 1) {
    val x = priorityQueue.poll()
    val y = priorityQueue.poll()
    val sum = x + y
    answer += sum
    priorityQueue.offer(sum)
}

bw.write(answer.toString())
bw.flush()
bw.close()
```

- 우선순위 큐를 활용하여 `queue`의 최소값 만을 두 개 꺼내어 합한다.
- 수행 중 합한 결과를 `answer`에 더하여 총 비교 횟수를 구한다.

## :black_nib: **Review**

- 사이트에 나와있는 예제가 너무 적어 테스트해보기 힘들었다 ...