package 알고리즘.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val numbers = IntArray(5) { nextInt() }
    println(solution(numbers))
}

fun solution(numbers : IntArray) : Int = numbers.sumOf { it * it } % 10

class BJ2475_검증수 {
}