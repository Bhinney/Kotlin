package 알고리즘.bronze

import java.util.Scanner

fun main () = with(Scanner(System.`in`)) {
    val n = nextInt()
    val s = "*";

    for (i in n downTo 1) println(s.repeat(i));
}
class `별찍기-3` {
}