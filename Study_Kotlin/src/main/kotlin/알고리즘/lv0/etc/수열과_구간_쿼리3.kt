package 알고리즘.lv0.etc

import java.util.*

fun main () {
    println(수열과_구간_쿼리3().solution(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 4))).contentToString())
}

class 수열과_구간_쿼리3 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { (i, j) ->  arr[i] = arr[j].also { arr[j] = arr[i] }}
        return arr
    }

    fun solution1(arr: IntArray, queries: Array<IntArray>): IntArray = arr.toList().also { list ->
        queries.forEach { (i, j) -> Collections.swap(list, i, j) }}.toIntArray()
}