import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
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
}

