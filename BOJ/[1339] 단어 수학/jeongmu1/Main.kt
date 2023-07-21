import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() {
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
}
