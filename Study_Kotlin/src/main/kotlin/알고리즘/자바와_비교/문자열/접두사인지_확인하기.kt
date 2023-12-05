package 알고리즘.자바와_비교.문자열

fun main() {
    println(접두사인지_확인하기().solution("banana", "ban"))
    println(접두사인지_확인하기().solution("banana", "nan"))
}
class 접두사인지_확인하기 {
    fun solution(my_string: String, is_prefix: String): Int = if (my_string.startsWith(is_prefix)) 1 else 0
}