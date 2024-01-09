package 알고리즘.lv0.문자열

fun main() {
    println(문자열_겹쳐쓰기().solution("He11oWor1d", "lloWorl", 2))
    println(문자열_겹쳐쓰기().solution("Program29b8UYP", "merS123", 7))
}
class 문자열_겹쳐쓰기 {
    fun solution1(my_string: String, overwrite_string: String, s: Int): String
    = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length)
    fun solution(my_string: String, overwrite_string: String, s: Int): String
            = my_string.replaceRange(s, s + overwrite_string.length, overwrite_string)
}