package 알고리즘.배열

fun main (){
    println(첫번째로_나오는_음수().solution(intArrayOf(12, 4, 15, 46, 38, -2, 15)))
    println(첫번째로_나오는_음수().solution(intArrayOf(13, 22, 53, 24, 15, 6)))
}
class 첫번째로_나오는_음수 {
    fun solution(num_list: IntArray): Int = num_list.indexOfFirst { it < 0 }
}