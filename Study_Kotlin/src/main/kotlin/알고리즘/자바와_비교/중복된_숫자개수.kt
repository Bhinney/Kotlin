package 알고리즘.자바와_비교

fun main(){
    println(중복된_숫자개수().solution(intArrayOf(1, 1, 2, 3, 4, 5), 1))
    println(중복된_숫자개수().solution(intArrayOf(0, 2, 3, 4), 1))
}

class 중복된_숫자개수 {
    fun solution(array: IntArray, n: Int): Int = array.count { it == n }
}