package 알고리즘.자바와_비교

fun main() {
    println(아이스_아메리카노().solution(5_500).contentToString())
    println(아이스_아메리카노().solution(15_000).contentToString())
}

class 아이스_아메리카노 {
    fun solution1(money: Int): IntArray {
        var answer: ArrayList<Int> = arrayListOf<Int>()

        answer.add(money / 5_500)
        answer.add(money % 5_500)

        return answer.toIntArray()
    }

    fun solution(money: Int): IntArray = intArrayOf(money / 5_500, money % 5_500)
}