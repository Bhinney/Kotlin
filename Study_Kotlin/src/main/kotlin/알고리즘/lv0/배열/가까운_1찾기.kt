package 알고리즘.lv0.배열

fun main() {
    println(가까운_1찾기().solution(intArrayOf(0, 0, 0, 1), 3))
    println(가까운_1찾기().solution(intArrayOf(1, 0, 0, 1, 0, 0), 4))
    println(가까운_1찾기().solution(intArrayOf(1, 1, 1, 1, 0), 3))
}
class 가까운_1찾기 {
    fun solution(arr: IntArray, idx: Int): Int
    = (idx .. arr.lastIndex).firstOrNull { arr[it] == 1 } ?: -1
}