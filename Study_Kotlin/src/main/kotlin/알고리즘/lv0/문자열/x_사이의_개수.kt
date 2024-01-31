package 알고리즘.lv0.문자열

class x_사이의_개수 {
    fun solution(myString: String): IntArray = myString.split("x").map { it.length }.toIntArray()
}