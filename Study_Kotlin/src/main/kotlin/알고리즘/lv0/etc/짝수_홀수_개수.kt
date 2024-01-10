package 알고리즘.lv0.etc

import kotlin.system.measureNanoTime

fun main(){

    /* 속도는 그냥 처음 구했던 것이 가장 긴거 같음 */

    var a = ""
    var b = ""
    var c = ""

    val measuredTime2 = measureNanoTime {
        b = 짝수_홀수_개수().solution2(intArrayOf(1, 2, 3, 4, 5)).contentToString()
    }

    val measuredTime3 = measureNanoTime {
        c = 짝수_홀수_개수().solution3(intArrayOf(1, 2, 3, 4, 5)).contentToString()
    }

    val measuredTime1 = measureNanoTime {
        a = 짝수_홀수_개수().solution1(intArrayOf(1, 2, 3, 4, 5)).contentToString()
    }


    println("solution1 소요 시간 : $measuredTime1")
    println("solution1 답 : $a")

    println()
    println("########################################")
    println()

    println("solution2 소요 시간 : $measuredTime2")
    println("solution2 답 : $b")

    println()
    println("########################################")
    println()

    println("solution3 소요 시간 : $measuredTime3")
    println("solution3 답 : $c")
}

class 짝수_홀수_개수 {
    fun solution1(num_list: IntArray): IntArray {
        var a = num_list.filter { it % 2 == 0 }.count()
        var b = num_list.filter { it % 2 != 0 }.count()

        return intArrayOf(a, b)
    }

    fun solution2(num_list: IntArray): IntArray =
        intArrayOf(num_list.filter { it % 2 == 0 }.size, num_list.filter { it % 2 != 0 }.size)

    fun solution3(num_list: IntArray): IntArray =
        intArrayOf(num_list.filter { it % 2 == 0 }.count(), num_list.filter { it % 2 != 0 }.count())
}