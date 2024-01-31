package 알고리즘.lv0.문자열

class 문자열이_몇번_등장하는지_세기 {
    fun solution(myString: String, pat: String): Int
    = (0 .. myString.length - pat.length).map {
        myString.slice(it .. it + pat.length)
    }.count {it == pat}
}