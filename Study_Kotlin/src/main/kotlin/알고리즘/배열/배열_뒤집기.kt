package 알고리즘.배열

fun main() {
    println(배열_뒤집기().solution(intArrayOf(1, 2, 3, 4, 5)).contentToString())
    println(배열_뒤집기().solution(intArrayOf(1, 1, 1, 1, 1, 2)).contentToString())
    println(배열_뒤집기().solution(intArrayOf(1, 0, 1, 1, 1, 3, 5)).contentToString())
}

class 배열_뒤집기 {
    fun solution(num_list: IntArray): IntArray = num_list.reversedArray()
}