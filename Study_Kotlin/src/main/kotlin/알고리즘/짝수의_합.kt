package 알고리즘

import kotlin.system.measureNanoTime

fun main() {
    var a = 0
    var b= 0
    val measuredTime1 = measureNanoTime {
        a = 짝수의_합().solution1(10)
    }

    val measuredTime2 = measureNanoTime {
        b = 짝수의_합().solution2(10)
    }

    println("내장 함수 정답 : $a")
    println("내장 함수 사용 소요 시간 : $measuredTime1")
    println()
    println("####################################")
    println()
    println("반복문 정답 : $b")
    println("반복문 소요 시간 : $measuredTime2")
}
class 짝수의_합 {
    fun solution1(n: Int): Int = (1 .. n).filter{it % 2 == 0}.sum()
    fun solution2(n: Int): Int {
        var ans = 0

        for (i : Int in 1 .. n) {
            if (i % 2 == 0) {
                ans += i
            }
        }

        return ans
    }
}