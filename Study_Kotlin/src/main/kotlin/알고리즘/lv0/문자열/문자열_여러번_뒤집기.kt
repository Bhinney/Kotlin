package 알고리즘.lv0.문자열

fun main() {
    println(문자열_여러번_뒤집기().solution("rermgorpsam", arrayOf(intArrayOf(2, 3), intArrayOf(0, 7), intArrayOf(5, 9), intArrayOf(6, 10))))
}

class 문자열_여러번_뒤집기 {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var ans = my_string



        queries.forEach { (s, e) ->
            ans = ans.slice(0 until s) + ans.slice(s .. e)
                .reversed() + ans.slice(e + 1 .. ans.lastIndex)
        }

        return ans
    }
}