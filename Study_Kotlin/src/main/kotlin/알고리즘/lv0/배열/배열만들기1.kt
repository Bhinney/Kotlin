package 알고리즘.lv0.배열

fun main () {
    println(배열만들기1().solution(10, 3).contentToString())
    println(배열만들기1().solution(15, 5).contentToString())
}
class 배열만들기1 {
    fun solution(n: Int, k: Int): IntArray
        = (k .. n step k).toList().toIntArray()
}