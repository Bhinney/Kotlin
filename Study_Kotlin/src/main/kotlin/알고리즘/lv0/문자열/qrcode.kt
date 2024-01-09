package 알고리즘.lv0.문자열


fun main() {
    println(qrcode().solution(3, 1, "qjnwezgrpirldywt"))
    println(qrcode().solution(1, 0, "programmers"))
}
class qrcode {
    fun solution(q: Int, r: Int, code: String): String
            = (r .. code.lastIndex step q).map { code[it] }.joinToString("")
}