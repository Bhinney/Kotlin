package 알고리즘.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var n = 1000 - nextInt()
    var ans = 0
    val coins = intArrayOf(500, 100, 50, 10, 5, 1)

    for (i in 0 ..< coins.size) {
        if (n >= coins[i]) {
            val cnt = n / coins[i]
            ans += cnt
            n -= (coins[i] * cnt)
        }
    }

    println(ans)
}

class BJ5585_거스름돈 {
}