package 이론

fun main() {
//    filterExample()
    takeExample()
}

val days = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

// filter() : 리스트내에 인자들 중 조건에 일치하는 인자만 필터링
fun filterExample() {
    days.filter { day -> day.contains("S") }.forEach { println(it) }
}

// take() : 함수의 인자로 받은 개수만큼만을 리스트로 반환
// takeWhile() : 조건이 참인 것만 반복문을 통해 확인 후 가져옴, 조건이 거짓이면 바로 멈춤
fun takeExample() {

    println("< 앞에서 두 개 가져오기 >")
    days.take(2).forEach { print("$it ") }
    println()

    println("< 뒤에서 두 개 가져오기 >")
    days.takeLast(2).forEach { print("$it ") }
    println()

    println("< takeWhile() 앞에서 >")
    days.takeWhile { day -> day.length == 6 }.forEach { print("$it ") }
    println()

    println("< takeLastWhile() 뒤부터 조건 확인 >")
    days.takeLastWhile { day -> day.startsWith("S") }.forEach { print("$it ") }
}

fun dropExample() {

}


class `9_스트림_필터링` {
}