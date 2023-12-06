package 이론

fun main() {
//    zipExample()
//    joinToStringExample()
//    reduceFoldExample()
//    anyNoneExample()
    numExample()
}

val koreanDays = arrayListOf("월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일")
val englishDays = arrayListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
val numbers = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// zip() : zip() 함수는 두 컬랙션의 자료들을 조합하여 새로운 자료를 만들 때 사용
fun zipExample() {
    englishDays.zip(koreanDays) {eng, kor -> "$eng : $kor "}.forEach { println(it) }
}

// joinToString() : 컬렉션을 문자열로 변환하여 한 문자열로 반환
fun joinToStringExample() {
    println(koreanDays.joinToString(", "))
}

//reduce(), fold() : 컬렉션 내의 자료를 다 합쳐줌
fun reduceFoldExample() {
    koreanDays.reduce { now, next ->
        println("오늘은 $now, 내일은 $next")
        next
    }
    englishDays.fold("") { now, next ->
        println("Today is $now, tomorrow is $next")
        next
    }

    numbers.reduce{ next, total ->
        println("next $next total $total")
        next + total }
    numbers.fold(numbers.first()) {next, total ->
        println("next $next total $total")
        next + total}
}

// any(), none() : 컬렉션에서 자료의 존재 여부를 반환
fun anyNoneExample() {
    // 자료가 있으면 true 없으면 false
    println(koreanDays.any())
    println(englishDays.any { day -> day.startsWith("N")})

    // 자료가 있으면 false 없으면 true
    println(koreanDays.none())
    println(englishDays.none { day -> day.startsWith("N") })
}

fun numExample() {

    // max() : 가장 큰 값 반환
    println(numbers.max())

    // min() : 가장 작은 값 반환
    println(numbers.min())

    // sum() : 더한 값 반환
    println(numbers.sum())

    // average() : 평균 값 반환
    println(numbers.average())
}

class `10_스트림_조합_및_기타` {
}