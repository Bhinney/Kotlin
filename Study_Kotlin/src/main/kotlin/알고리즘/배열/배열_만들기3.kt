package 알고리즘.배열

fun main() {
    println(배열_만들기3().solution(intArrayOf(1, 2, 3, 4, 5), arrayOf(intArrayOf(1, 3), intArrayOf(0, 4))).contentToString())
}
class 배열_만들기3 {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray
            = intervals.flatMap { nums -> arr.slice(nums[0] .. nums[1]) }.toIntArray()
    fun solution1(arr: IntArray, intervals: Array<IntArray>): IntArray
    = (arr.sliceArray(intervals[0][0] .. intervals[0][1])) + (arr.sliceArray(intervals[1][0] .. intervals[1][1]))
}