package 알고리즘.lv0.etc

fun main() {
    println(최댓값_만들기_1().solution(intArrayOf(1,2, 3, 4, 5)))
    println(최댓값_만들기_1().solution(intArrayOf(0, 31, 24, 10, 1, 9)))
}

class 최댓값_만들기_1 {
    fun solution1(numbers: IntArray): Int {
        numbers.sortDescending()
        return numbers[0] * numbers[1]
    }

    fun solution2(numbers: IntArray): Int = numbers.sorted().let { it[it.size - 1] * it[it.size - 2] }

    fun solution(numbers: IntArray): Int = numbers.sorted().takeLast(2).fold(1) {i, acc -> acc * i}
}