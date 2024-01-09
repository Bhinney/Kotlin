package 알고리즘.배열

fun main() {
    println(배열_만들기2().solution(5, 555).contentToString())
}
class 배열_만들기2 {
    fun solution(l: Int, r: Int): IntArray
        = (l..r).filter { it.toString().all { ch -> ch == '0' || ch == '5' } }.takeIf(List<Int>::isNotEmpty)?.toIntArray()
        ?: intArrayOf(-1)
}