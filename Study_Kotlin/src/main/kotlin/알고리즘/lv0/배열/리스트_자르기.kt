package 알고리즘.lv0.배열

fun main() {
    println(리스트_자르기().solution(3, intArrayOf(1, 5, 2), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)).contentToString())
    println(리스트_자르기().solution(4, intArrayOf(1, 5, 2), intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)).contentToString())
}
class 리스트_자르기 {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {

        return when(n) {
            1 -> num_list.sliceArray(0 .. slicer[1])
            2 -> num_list.sliceArray(slicer[0] .. num_list.lastIndex)
            3 -> num_list.sliceArray(slicer[0] .. slicer[1])
            else -> num_list.slice(slicer[0]..slicer[1] step slicer[2]).toIntArray()
        }
    }
}