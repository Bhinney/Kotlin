package 알고리즘.문자열

fun main() {
    println(조건_문자열().solution("<", "=", 20, 50))
}
class 조건_문자열 {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        var ans = 0
        when(ineq + eq) {
            ">=" -> ans = if (n >= m) 1 else 0
            ">!" -> ans = if (n > m) 1 else 0
            "<!" -> ans = if (n < m) 1 else 0
            "<=" -> ans = if (n <= m) 1 else 0
        }

        return ans
    }
}