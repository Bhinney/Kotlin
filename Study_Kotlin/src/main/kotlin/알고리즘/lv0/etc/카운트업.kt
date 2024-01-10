package 알고리즘.lv0.etc

fun main() {
    println(카운트업().solution(3, 10).contentToString())
}
class 카운트업 {
    fun solution(start_num: Int, end_num: Int): IntArray = (start_num .. end_num).toList().toIntArray()
}