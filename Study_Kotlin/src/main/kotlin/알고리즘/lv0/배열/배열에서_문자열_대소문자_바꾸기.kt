package 알고리즘.lv0.배열

fun main() {
    println(배열에서_문자열_대소문자_바꾸기().solution(arrayOf("AAA","BBB","CCC","DDD")).contentToString())
}
class 배열에서_문자열_대소문자_바꾸기 {
    fun solution(strArr: Array<String>): Array<String>
    = strArr.mapIndexed { index, s ->
        if (index % 2 == 0) s.lowercase()
        else s.uppercase()
    }.toTypedArray()
}