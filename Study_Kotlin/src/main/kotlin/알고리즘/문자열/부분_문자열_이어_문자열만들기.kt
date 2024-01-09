package 알고리즘.문자열

fun main() {
    println(부분_문자열_이어_문자열만들기().solution(arrayOf("progressive", "hamburger", "hammer", "ahocorasick"),
        arrayOf(intArrayOf(0, 4), intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(7, 7))))
}
class 부분_문자열_이어_문자열만들기 {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String
        = my_strings.mapIndexed { idx, str -> str.slice(parts[idx][0] .. parts[idx][1]) }.joinToString("")
}