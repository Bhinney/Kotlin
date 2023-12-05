package 알고리즘

import kotlin.math.ceil

fun main() {
    println(피자_나눠먹기_1().solution(7))
    println(피자_나눠먹기_1().solution(1))
    println(피자_나눠먹기_1().solution(15))
}

class 피자_나눠먹기_1 {
    fun solution(n: Int): Int = ceil(n.toDouble() / 7.0).toInt()
}