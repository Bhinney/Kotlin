package 알고리즘.lv0.etc

fun main() {
    println(조건에_맞게_수열_변환하기2().solution(intArrayOf(1, 2, 3, 100, 99, 98)))
}
class 조건에_맞게_수열_변환하기2 {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        while (func(arr)) answer++
        return answer
    }

    private fun func(arr: IntArray): Boolean {
        var flag = false

        arr.indices.forEach {
            if (arr[it] >= 50 && arr[it] % 2 == 0) {
                arr[it] /= 2
                flag = true
            } else if (arr[it] < 50 && arr[it] % 2 == 1) {
                arr[it] = arr[it] * 2 + 1
                flag = true
            }
        }

        return flag
    }
}