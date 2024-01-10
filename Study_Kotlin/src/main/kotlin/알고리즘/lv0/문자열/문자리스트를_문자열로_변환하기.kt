package 알고리즘.lv0.문자열

fun main() {
    println(문자리스트를_문자열로_변환하기().solution(arrayOf("a","b","c")))
}
class 문자리스트를_문자열로_변환하기 {
    fun solution(arr: Array<String>): String = arr.joinToString("")
}