package 알고리즘.lv0.문자열

class 특정_문자열로_끝나는_가장_긴_문자열 {
    fun solution(myString: String, pat: String): String
    = myString.substring(0, myString.lastIndexOf(pat) + pat.length)
}