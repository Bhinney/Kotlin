package 알고리즘.연산
fun main() {
    val num1 : Int = 10
    val num2 : Int = 3

    val plus = 연산().plus(num1, num2)
    val minus = 연산().minus(num1, num2)
    val multiply = 연산().multiply(num1, num2)
    val divide = 연산().divide(num1, num2)
    val remain = 연산().remainder(num1, num2)

    println("더하기 : $plus")
    println("빼기 : $minus")
    println("곱하기 : $multiply")
    println("나누기 : $divide")
    println("나머지 : $remain")
}

class 연산 {
    fun plus(num1: Int, num2: Int) : Int = num1 + num2
    fun minus (num1: Int, num2: Int) : Int = num1 - num2
    fun multiply(num1: Int, num2: Int) : Int = num1 * num2
    fun divide(num1: Int, num2: Int) : Int = num1 / num2
    fun remainder(num1: Int, num2: Int): Int = num1 % num2
}