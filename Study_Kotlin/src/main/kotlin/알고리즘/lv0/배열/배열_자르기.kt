package 알고리즘.lv0.배열

fun main() {
    println(배열_자르기().solution1(intArrayOf(1, 2, 3, 4, 5), 1, 3).contentToString())
    println(배열_자르기().solution3(intArrayOf(1, 2, 3, 4, 5), 1, 3).contentToString())
}

class 배열_자르기 {
    fun solution1(numbers: IntArray, num1: Int, num2: Int): IntArray = numbers.sliceArray(num1..num2)
    fun solution2(numbers: IntArray, num1: Int, num2: Int): IntArray = numbers.slice(num1..num2).toIntArray()
    fun solution3(numbers: IntArray, num1: Int, num2: Int): IntArray = numbers.copyOfRange(num1, num2 + 1)
    fun solution4(numbers: IntArray, num1: Int, num2: Int): IntArray = numbers.toList().subList(num1, num2 + 1).toIntArray()
}