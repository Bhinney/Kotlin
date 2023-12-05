package 이론
fun main() {
//    mapExample()
//    mapIdxExample()
    flatMapExample()
}

// map() : 컬렉션 내의 인자를 변환하여 반환할 때 사용
// mapNotNull() : 컬렉션 내의 인자를 변환하여 반환할 때 사용 + null 값을 허용 하지 않음
fun mapExample() {
    val days = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    // map()
    println("< map() 함수를 사용 했을 때 >")
    days.map { day -> "오늘은 $day" }.forEach { println(it) }

    println()

    println("< map() 함수를 사용하고 null 값이 있을 때 >")
    days.map { day -> if (day.length > 6) day else null }.forEach { println(it) }

    println()

    // mapNotNull
    println("< mapNotNull() 함수를 사용 했을 때 >")
    days.mapNotNull { day -> if (day.length > 6) day else null }.forEach { println(it) }
}

// mapIndexed() : 컬렉션에 포함된 인자의 인덱스 값을 변환하여 사용
fun mapIdxExample() {
    val days = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    days.mapIndexed { index, s -> "$index 번째 요일 : $s"}.forEach{ println(it) }
}



// flatMap() : map()함수와 비슷하지만 다른부분이 변환함수의 반환형이 Interable, 하나의 인자에서 여러 개의 인자로 매핑이 필요할 때 사용
fun flatMapExample() {
    val days = listOf("Saturday", "Sunday")

    days.flatMap { "$it".toList() }.forEach { print("#$it ") }
}

class `8_스트림_맵` {
}