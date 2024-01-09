package 알고리즘.lv0.배열

fun main() {
    println(마지막_두_원소().solution(intArrayOf(2, 1, 6)).contentToString())
    println(마지막_두_원소().solution(intArrayOf(5, 2, 1, 7, 5)).contentToString())
}

class 마지막_두_원소 {
    fun solution(num_list: IntArray): IntArray {
        val last = num_list[num_list.size - 1]
        val lastMinusOne = num_list[num_list.size - 2]
        return num_list + if (last > lastMinusOne) last - lastMinusOne else last * 2
    }
}