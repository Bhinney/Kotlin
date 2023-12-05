package 알고리즘

fun main() {
    println(양꼬치().solution(10, 3))
    println(양꼬치().solution(64, 6))
}

class 양꼬치 {
    fun solution1(n: Int, k: Int): Int {
        var price1 = 12000
        var price2 = 2000

        var drink = k
        if (n >= 10) drink -= n / 10

        return n * price1 + drink * price2
    }

    fun solution(n: Int, k: Int): Int = n * 12000 + (k - (n / 10)) * 2000
}