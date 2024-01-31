package 알고리즘.bronze

import java.util.Scanner

class 찍기_N {
    fun main(args: Array<String>) = with(Scanner(System.`in`)) {
        val n = nextInt()

        for (i in n downTo 1) println(i);
    }
}