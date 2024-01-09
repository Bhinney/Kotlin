package 알고리즘.문자열

fun main() {
    println(글자지우기().solution("apporoograpemmemprs", intArrayOf(1, 16, 6, 15, 0, 10, 11, 3)))
}
class 글자지우기 {
    fun solution(my_string: String, indices: IntArray): String
    = my_string.filterIndexed { index, c -> index !in indices }
}