package 알고리즘.lv0.문자열

class 문자열_정수의_합 {
    fun solution(num_str: String): Int = num_str.toCharArray().map { it.digitToInt() }.sum()
}