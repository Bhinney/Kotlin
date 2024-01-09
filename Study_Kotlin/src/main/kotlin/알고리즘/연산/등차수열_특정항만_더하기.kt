package 알고리즘.연산

fun main() {
    println(등차수열_특정항만_더하기().solution(3, 4, booleanArrayOf(true, false, false, true, true)))
    println(등차수열_특정항만_더하기().solution(7, 1, booleanArrayOf(false, false, false, true, false, false, false)))
}
class 등차수열_특정항만_더하기 {
    fun solution(a: Int, d: Int, included: BooleanArray): Int = included.indices.filter { included[it] }.sumOf { a + d * it }
}