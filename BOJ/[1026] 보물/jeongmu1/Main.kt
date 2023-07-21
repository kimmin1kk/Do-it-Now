import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
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
}