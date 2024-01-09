package 알고리즘.lv0.etc

fun main() {
    println(콜라츠_수열_만들기().solution(10).contentToString())
}
class 콜라츠_수열_만들기 {
    fun solution(n: Int): IntArray {
        var num = n
        var answer = mutableListOf(num)
        while (num != 1) {
            if (num % 2 == 0) num /= 2
            else num = 3 * num + 1
            answer.add(num)
        }
        return answer.toIntArray()
    }
}