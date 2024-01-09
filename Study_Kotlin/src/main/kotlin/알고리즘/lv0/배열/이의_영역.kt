package 알고리즘.lv0.배열

fun main() {
    println(이의_영역().solution(intArrayOf(1, 2, 1, 4, 5, 2, 9)).contentToString())
    println(이의_영역().solution(intArrayOf(1, 2, 1)).contentToString())
    println(이의_영역().solution(intArrayOf(1, 1, 1)).contentToString())
    println(이의_영역().solution(intArrayOf(1, 2, 1, 2, 1, 10, 2, 1)).contentToString())
}
class 이의_영역 {
    fun solution(arr: IntArray): IntArray
    = if (arr.contains(2)) arr.sliceArray(arr.indexOf(2) .. arr.lastIndexOf(2)) else intArrayOf(-1)
}