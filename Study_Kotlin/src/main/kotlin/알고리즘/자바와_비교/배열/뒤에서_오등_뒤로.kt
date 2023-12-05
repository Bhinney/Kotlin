package 알고리즘.자바와_비교.배열

fun main() {
    println(뒤에서_오등_뒤로().solution(intArrayOf(12, 4, 15, 46, 38, 1, 14, 56, 32, 10)).contentToString())
}
class 뒤에서_오등_뒤로 {
    fun solution1(num_list: IntArray): IntArray = num_list.sortedArray().sliceArray(5 .. num_list.size)
    fun solution(num_list: IntArray): IntArray = num_list.sorted().drop(5).toIntArray()

}