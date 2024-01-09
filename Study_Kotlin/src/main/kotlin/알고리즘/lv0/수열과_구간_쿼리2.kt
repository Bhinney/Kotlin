package 알고리즘.lv0

fun main () {
//    println(수열과_구간_쿼리3().solution(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 4))).contentToString())
    println(수열과_구간_쿼리2().solution(intArrayOf(0, 1, 2, 4, 3), arrayOf(intArrayOf(0, 4, 2), intArrayOf(0, 3, 2), intArrayOf(0, 2, 2))).contentToString())
}
class 수열과_구간_쿼리2 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray = queries.map { (s, e, k) ->
            arr.slice(s..e).filter { it > k }.minOrNull() ?: -1
        }.toIntArray()
}