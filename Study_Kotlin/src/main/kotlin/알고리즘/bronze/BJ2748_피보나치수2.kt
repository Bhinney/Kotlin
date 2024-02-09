package 알고리즘.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    val dp = LongArray(n + 1)
    dp[1] = 1;
    for (i in 2 .. n) {
        dp[i] = dp[i - 1] + dp[i - 2]
    }

    println(dp[n])
}

class BJ2748_피보나치수2 {
}