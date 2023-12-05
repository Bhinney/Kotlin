package 알고리즘.배열

import kotlin.system.measureNanoTime

fun main() {
    var a = 0.0
    var b = 0.0
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).toIntArray()

    val measuredTime1 = measureNanoTime {
        a = 배열의_평균값().solution1(arr)
    }

    val measuredTime2 = measureNanoTime {
        b = 배열의_평균값().solution2(arr)
    }

    println("내장 함수 정답 : $a")
    println("내장 함수 사용 소요 시간 : $measuredTime1")
    println()
    println("####################################")
    println()
    println("반복문 정답 : $b")
    println("반복문 소요 시간 : $measuredTime2")
}

class 배열의_평균값 {
    fun solution1(numbers: IntArray): Double = numbers.average()
    fun solution2(numbers: IntArray): Double {
        var sum : Double = 0.0

        for (i : Int in 0..numbers.size - 1) {
            sum += numbers[i].toDouble()
        }

        return sum / numbers.size
    }
}