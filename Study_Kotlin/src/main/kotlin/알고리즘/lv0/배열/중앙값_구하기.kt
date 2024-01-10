package 알고리즘.lv0.배열

fun main() {
    println(중앙값_구하기().solution(intArrayOf(9, -1, 0)))
}

class 중앙값_구하기 {
    fun solution1(array: IntArray): Int {
        array.sort();
        return array[array.size / 2]
    }

    fun solution(array: IntArray) : Int = array.sorted()[array.size / 2]
}