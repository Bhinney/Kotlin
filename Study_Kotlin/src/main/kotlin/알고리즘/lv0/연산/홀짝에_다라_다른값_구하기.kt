package 알고리즘.lv0.연산

import kotlin.math.pow

fun main() {
    println(홀짝에_다라_다른값_구하기().solution(7))
    println(홀짝에_다라_다른값_구하기().solution(10))

}
class 홀짝에_다라_다른값_구하기 {
    fun solution(n: Int): Int = if (n % 2 == 0) (2 .. n step 2).map { it.toDouble().pow(2) }.sum().toInt()
        else (1 .. n step 2).sum()
}