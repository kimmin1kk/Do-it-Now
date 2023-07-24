import java.util.PriorityQueue

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