package 알고리즘.bronze

import java.util.Scanner

fun main(args : Array<String>) = with(Scanner(System.`in`)) {
    val arr = Array(2) {nextInt()}
    var ans1 = gcd(arr[0], arr[1])
    var ans2 = (arr[0] * arr[1]) / ans1
    println(ans1)
    println(ans2)
}
private fun gcd(n : Int, m : Int): Int = if (m != 0) gcd(m, n % m) else n

class 최대공약수와_최소공배수 {
}