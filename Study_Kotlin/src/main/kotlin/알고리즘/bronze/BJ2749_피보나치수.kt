package 알고리즘.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val arr = IntArray(n + 1) {0}
    arr[1] = 1
    (2..n).forEach { arr[it] = (arr[it - 2] + arr[it - 1]) }
    println(arr[n])
}

class BJ2749_피보나치수 {
}