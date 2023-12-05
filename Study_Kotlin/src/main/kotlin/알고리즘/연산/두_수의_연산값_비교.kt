package 알고리즘.연산

fun main() {
    println(두_수의_연산값_비교().solution(12, 3))
}
class 두_수의_연산값_비교 {
    fun solution(a: Int, b: Int): Int = maxOf("$a$b".toInt(), 2 * a * b)
}