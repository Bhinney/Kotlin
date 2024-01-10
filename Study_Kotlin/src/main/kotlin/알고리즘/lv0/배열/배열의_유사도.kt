package 알고리즘.lv0.배열

fun main(){
    println(배열의_유사도().solution(arrayOf("a", "b", "c"), arrayOf("com", "b", "d", "p", "c")))
}

class 배열의_유사도 {
    fun solution1(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0

        for (i : Int in 0 .. s1.size - 1) {
            if (s2.contains(s1[i])) answer++;
        }

        return answer
    }

//    fun solution(s1: Array<String>, s2: Array<String>): Int = s1.map(s2::contains).count{it}
    fun solution(s1: Array<String>, s2: Array<String>): Int = s1.count { s2.contains(it) }
}