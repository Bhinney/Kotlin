package 알고리즘.문자열

fun main() {
    println(문자열_섞기().solution("aaaa", "bbbb"))
}
class 문자열_섞기 {
    fun solution1(str1: String, str2: String): String {
        var answer: String = ""
        for (i in str1.indices) {
            answer += str1[i]
            answer += str2[i]
        }
        return answer
    }

    fun solution(str1: String, str2: String) = str1.zip(str2).joinToString("") { (a, b) -> "$a$b" }
}