package 알고리즘.연산

fun main() {
    println(더_크게_합치기().solution(9, 91))
}
class 더_크게_합치기 {
    fun solution(a: Int, b: Int): Int = maxOf("$a$b".toInt(), "$b$a".toInt())
}