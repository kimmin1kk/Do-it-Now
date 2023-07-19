import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.PriorityQueue

fun main() {
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
}