package 알고리즘.배열

fun main() {
    print(배열_두배_만들기().solution(intArrayOf(1, 2, 3, 4, 5)).contentToString())
}

class 배열_두배_만들기 {
    fun solution(numbers: IntArray): IntArray = numbers.map { it * 2 }.toIntArray()
}