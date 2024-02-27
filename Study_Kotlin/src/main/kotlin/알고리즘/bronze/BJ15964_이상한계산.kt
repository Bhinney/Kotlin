package 알고리즘.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val arr = readLine().split(" ")
    println(calculate(arr[0].toLong(), arr[1].toLong()))
}

private fun calculate(a : Long, b : Long) : Long = (a + b) * (a - b)


class BJ15964_이상한계산 {
}