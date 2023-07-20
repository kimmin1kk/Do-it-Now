import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
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
}