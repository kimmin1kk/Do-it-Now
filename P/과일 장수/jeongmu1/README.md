# 과일 장수

## :pushpin: **Algorithm**

+ 힙 정렬
+ 그리디 알고리즘

## :round_pushpin: **Logic**

 ```kotlin
class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0

        val queue = PriorityQueue<Int>(reverseOrder())
        for (sc in score) {
            queue.add(sc)
        }

        var tempList = MutableList<Int>(0) { 0 }


        while(queue.size > m) {
            val tempList = MutableList<Int>(0) {0}
            for (i in 1 .. m) {
                tempList.add(queue.poll())
            }
            answer += min(tempList, k) * m
        }

        if (queue.size == m) {
            tempList = MutableList<Int>(0) { 0 }
            for (i in 1 until m) {
                tempList.add(queue.poll())
            }
            answer += min(tempList, k) * m
        }

        return answer
    }

    private fun min(list: List<Int>, k: Int): Int {
        var min = k
        for (e in list) {
            if (e < k) {
                min = e
            }
        }

        return min
    }
}
```

- `score`에 있는 모든 값을 우선순위 큐에 삽입
- 상자의 크기 만큼 우선순위 큐에서 값을 빼내어 그 중 최소값을 상자 크기 만큼 곱한 후 `answer`에 더한다.
- 마지막 남은 과일들은 한 상자에 담을 수 있을 경우 연산하고 아니면 넘긴다.

## :black_nib: **Review**

- 프로그래머스에서 mutableListOf() 함수나 min() 함수를 사용하지 못해서 불편했다.
- 계속 `tempList`를 다시 만드는 과정에서 오버헤드가 발생하여 성능저하가 일어나지 않았을까 걱정된다.