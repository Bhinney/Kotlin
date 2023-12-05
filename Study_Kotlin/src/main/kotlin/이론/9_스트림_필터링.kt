package 이론

import kotlin.math.absoluteValue

fun main() {
//    firstLastExample()
    filterExample()
//    takeExample()
//    dropExample()
//    distinctExample()
}

val days = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

// first() : 첫 번째 인자 반환 -> Null 발생시 오류
// last() : 마지막 인자 반환 -> Null 발생시 오류
// firstOrNull() : 첫 번째 인자 반환 -> Null 발생시 Null 반환
// lastOrNull() : 첫 번째 인자 반환 -> Null 발생시 Null 반환
fun firstLastExample() {
    println("< first() >")
    println("첫 번째 인자는 " + days.first() + "\n")

    println("< last() >")
    println("마지막 인자는 " + days.last() + "\n")

    println("< 조건이 있는 first() >")
    println("첫 번째 인자는 " + days.first {day -> day.startsWith("W")} + "\n")

    println("< 조건이 있는 last() >")
    println("마지막 인자는 " + days.last {day -> day.startsWith("W")} + "\n")

    println("< firstOrNull() >")
//    println(days.first() {day -> day.startsWith("N")}) -> NoSuchElementException
    println("N으로 시작 하는 요일 : " + days.firstOrNull {day -> day.startsWith("N")} + "\n")

    println("< lastOrNull() >")
//    println(days.last() {day -> day.startsWith("N")}) -> NoSuchElementException
    println("N으로 시작 하는 요일 : " + days.lastOrNull {day -> day.startsWith("N")} + "\n")
}

// filter() : List 내에 인자들 중 조건에 일치하는 인자만 필터링
fun filterExample() {
    days.filter { day -> day.contains("S") }.forEach { print("$it ") }
}

// take() : 함수의 인자로 받은 개수 만큼 List 반환
// takeWhile() : 조건이 false가 될 때까지 조건에 부합하는 인자들 take
fun takeExample() {
    println("< take() >")
    days.take(2).forEach { print("$it ") }
    println("\n")

    println("< takeLast() >")
    days.takeLast(2).forEach { print("$it ") }
    println("\n")

    println("< takeWhile() >")
    days.takeWhile { day -> day.length == 6 }.forEach { print("$it ") }
    println("\n")

    println("< takeLastWhile() >")
    days.takeLastWhile { day -> day.startsWith("S") }.forEach { print("$it ") }
}

// drop() :  take() 함수와 반대로 조건을 만족하는 항목을 제외한 List 반환
// dropWhile() : 조건이 false가 될 때까지 조건에 부합하는 인자들 drop
fun dropExample() {
    println("< drop() >")
    days.drop(2).forEach { print("$it ") }
    println("\n")

    println("< dropLast() >")
    days.dropLast(2).forEach { print("$it ") }
    println("\n")

    println("< dropWhile() >")
    days.dropWhile { day -> day.length < 9 }.forEach { print("$it ") }
    println("\n")

    println("< dropLastWhile() >")
    days.dropLastWhile { day -> day.length < 9  }.forEach { print("$it ") }
}

// distinct() : 중복된 항복 제외 후 반환
fun distinctExample(){
    val numbers = arrayListOf(1, 1, -1, 0, -3, 1, 2, -2, 2, 0)

    println("< distinct() >")
    println(numbers.distinct())
    println()

    println("< distinctBy() >")
    println(numbers.distinctBy { number -> number.absoluteValue })
}

class `9_스트림_필터링` {
}