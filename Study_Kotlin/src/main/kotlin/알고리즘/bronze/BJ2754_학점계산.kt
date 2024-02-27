package 알고리즘.bronze

fun main() = with(System.`in`.bufferedReader()) {
    val str = readLine()
    println(score(str))
}

private fun score(str : String) : Double {
    return when (str) {
        "A+" -> 4.3
        "A0" -> 4.0
        "A-" -> 3.7
        "B+" -> 3.3
        "B0" -> 3.0
        "B-" -> 2.7
        "C+" -> 2.3
        "C0" -> 2.0
        "C-" -> 1.7
        "D+" -> 1.3
        "D0" -> 1.0
        "D-" -> 0.7
        else -> 0.0
    }
}
class BJ2754_학점계산 {
}