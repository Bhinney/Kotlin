package 알고리즘.문자열

fun main() {
    println(코드_처리하기().solution("abc1abc1abc"))
}
class 코드_처리하기 {
    fun solution(code: String): String {
        var answer = ""
        var mode = false

        for (i in code.indices) {
            if (mode) {
                if (code[i] == '1') mode = mode.not()
                else if (i % 2 != 0) answer += code[i]
            } else {
                if (code[i] == '1') mode = mode.not()
                else if (i % 2 == 0) answer += code[i]
            }
        }

        return if (answer.isNotEmpty()) answer else "EMPTY"
    }
}