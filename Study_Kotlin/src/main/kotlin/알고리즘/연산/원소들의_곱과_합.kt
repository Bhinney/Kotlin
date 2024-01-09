package 알고리즘.연산

import kotlin.math.pow

fun main() {
    println(원소들의_곱과_합().solution(intArrayOf(3, 4, 5, 2, 1)))
}
class 원소들의_곱과_합 {
    fun solution(num_list: IntArray): Int {
        val sum = num_list.sum().toDouble().pow(2).toInt()
        val multiply = num_list.reduce { a, b ->  a * b}

        return if (sum > multiply) 1 else 0
    }
}