package 알고리즘.lv0.연산

fun main() {
    println(길이에_따른_연산().solution(intArrayOf(3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1)))
    println()
    println(길이에_따른_연산().solution(intArrayOf(2, 3, 4, 5)))
}

class 길이에_따른_연산 {
    fun solution(num_list: IntArray): Int = if (num_list.size > 10) num_list.sum() else num_list.reduce{acc, i -> acc * i}
}