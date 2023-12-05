package 알고리즘.문자열

fun main() {
    println(문자열_곱하기().solution("string", 3))
}
class 문자열_곱하기 {
    fun solution(my_string : String, k : Int) = my_string.repeat(k)
}