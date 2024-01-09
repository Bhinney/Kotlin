package 알고리즘.배열

fun main() {
    println(배열만들기().solution(arrayOf("0123456789","9876543210","9999999999999"), 50000, 5, 5).contentToString())
}
class 배열만들기 {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray
         = intStrs.map { it.slice(s until s + l).toInt() }.filter { it > k }.toIntArray()
}