package 알고리즘.배열

fun main() {
    println(접미사_배열().solution("banana").contentToString())
}
class 접미사_배열 {
    fun solution(my_string: String): Array<String>
        = (0 .. my_string.lastIndex).map { idx -> my_string.substring(idx) }.sorted().toTypedArray()
}