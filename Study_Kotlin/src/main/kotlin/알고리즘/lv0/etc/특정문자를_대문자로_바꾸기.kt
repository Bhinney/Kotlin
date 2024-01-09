package 알고리즘.lv0.etc

fun main() {
    println(특정문자를_대문자로_바꾸기().solution("programmers", "p"))
    println(특정문자를_대문자로_바꾸기().solution("i love you", "o"))
}

class 특정문자를_대문자로_바꾸기 {
    fun solution(my_string: String, alp: String): String = my_string.replace(alp, alp.uppercase())
}