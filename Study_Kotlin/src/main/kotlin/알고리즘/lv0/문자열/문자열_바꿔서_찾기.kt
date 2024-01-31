package 알고리즘.lv0.문자열

class 문자열_바꿔서_찾기 {
    fun solution(myString: String, pat: String): Int
    = if (myString.map { if (it == 'A') 'B' else 'A' }.joinToString("").contains(pat)) 1 else 0
}