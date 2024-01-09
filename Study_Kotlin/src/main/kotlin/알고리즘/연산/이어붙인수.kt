package 알고리즘.연산

fun main() {
    println(이어붙인수().solution(intArrayOf(3, 4, 5, 2, 1)))
}
class 이어붙인수 {
    fun solution(num_list: IntArray): Int = num_list.filter { i -> i % 2 != 0 }.joinToString("").toInt() + num_list.filter { i -> i % 2 == 0 }.joinToString("").toInt()
}