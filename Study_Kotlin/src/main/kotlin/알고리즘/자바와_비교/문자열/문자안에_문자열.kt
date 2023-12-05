package 알고리즘.자바와_비교.문자열

fun main() {
    println(문자안에_문자열().solution("ab6CDE443fgh22iJKlmn1o", "6CD"))
    println(문자안에_문자열().solution("ppprrrogrammers", "6CD"))
}

class 문자안에_문자열 {
    fun solution1(str1: String, str2: String): Int {
        if (str1.contains(str2))
            return 1
        else return 2
    }

    fun solution(str1: String, str2: String): Int = if (str1.contains(str2)) 1 else 2
}