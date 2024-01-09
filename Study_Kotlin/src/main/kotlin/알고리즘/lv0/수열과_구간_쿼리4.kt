package 알고리즘.lv0

fun main() {
    println(수열과_구간_쿼리4().solution(intArrayOf(0, 1, 2, 4, 3), arrayOf(intArrayOf(0, 4, 1), intArrayOf(0, 3, 2), intArrayOf(0, 3, 3))).contentToString())
}
class 수열과_구간_쿼리4 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray
        = arr.apply { queries.forEach { (s, e, k) -> (s .. e).filter { it % k == 0 }.forEach { arr[it]++ } } }
}