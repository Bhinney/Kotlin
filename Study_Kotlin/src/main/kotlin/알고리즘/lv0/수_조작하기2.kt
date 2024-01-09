package 알고리즘.lv0

fun main () {
    println(수_조작하기2().solution(intArrayOf(0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1)))
}
class 수_조작하기2 {
    fun solution(numLog: IntArray): String = (1..numLog.lastIndex).map {
        when (numLog[it] - numLog[it - 1]) {
            1 -> 'w'
            -1 -> 's'
            10 -> 'd'
            -10 -> 'a'
            else -> {}
        }
    }.joinToString("")
}