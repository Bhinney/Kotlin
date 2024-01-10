package 알고리즘.lv0.배열

fun main() {
    println(배열_원소의_길이().solution(arrayOf("We", "are", "the", "world!")).contentToString())
    println(배열_원소의_길이().solution(arrayOf("I", "Love", "Programmers.")).contentToString())
}

class 배열_원소의_길이 {
    fun solution1(strlist: Array<String>): IntArray {
        var answer: ArrayList<Int> = arrayListOf<Int>()

        for (i : Int in 0..strlist.size - 1) {
            answer.add(strlist[i].length)
        }

        return answer.toIntArray()
    }

    fun solution(strlist: Array<String>): IntArray = strlist.map { it.length }.toIntArray()
}