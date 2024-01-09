package 알고리즘.lv0

import kotlin.math.pow

fun main() {
    println(주사위게임2().solution(2, 6, 1))
    println(주사위게임2().solution(5, 3, 3))
    println(주사위게임2().solution(4, 4, 4))
}
class 주사위게임2 {
    fun solution(a: Int, b: Int, c: Int): Int {
        val one = a + b + c
        val two = (a.toDouble().pow(2) + b.toDouble().pow(2) + c.toDouble().pow(2)).toInt()
        val three = (a.toDouble().pow(3) + b.toDouble().pow(3) + c.toDouble().pow(3)).toInt()

        val set = intArrayOf(a, b, c).toSet();

        return when(set.size) {
            3 -> one
            2 -> one * two
            1 -> one * two * three
            else -> -1
        }
    }
}