package 알고리즘.lv0

fun main() {
    println(편지().solution("happy birthday!"))
    println(편지().solution("I love you~"))
}

class 편지 {
    fun solution(message: String): Int = message.length * 2
}