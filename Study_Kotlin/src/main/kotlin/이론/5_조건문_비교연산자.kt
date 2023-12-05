package 이론

fun main () {
    doIf(10)
    doIf("Hello")
    doIf(0.5)

    println()
    println("######################")
    println()

    doWhen(10)
    doWhen("Hello")
    doWhen(0.5)
}

fun doIf(a : Any) {
    if (a is Int)
        println("정수형 숫자 $a 입니다.")
    else if (a is String)
        println("문자열 \"$a\" 입니다")
    else
        println("문자열도 정수형 숫자도 아닙니다.")
}

fun doWhen(a : Any) {
    /* Any : 무슨 자료형이든 상관없이 호환되는 코틀린의 최상위 자료형 */

   when(a) {
        is Int -> println("정수형 숫자 $a 입니다.")
        is String -> println("문자열 \"$a\" 입니다")
        else -> println("문자열도 정수형 숫자도 아닙니다.")
    }
}


class `5_조건문_비교연산자` {

    /*
     * 조건문

     1. if 문
     * 조건문이 참일 경우, 중괄호 구문 실행
     * 만약 한 줄일 경우, 중괄호 생략 가능

     2. when 문
     * 다중 조건문
     * switch 문을 좀 더 편리하게 바꾼 것
     * if는 참과 거짓을 판별하는 조건문
     * when은 하나의 변수를 여려개의 값과 비교할 수 있음
     * 여러 개의 조건이 만족할 경우, 먼저 부합하는 조건이 실행됨
     */

    /*
     * 비교 연산자
     * <, <=, >, >=, !=, == (할당 연산자 '='와 혼동 방지)
     * is연산자, !is연산자
     */
}