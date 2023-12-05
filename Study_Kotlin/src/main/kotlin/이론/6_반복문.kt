package 이론

fun main() {
    whileExample()
    println("##########################")
    doWhileExample()
    println("##########################")
    forExample()
}

fun whileExample() {
    var a = 1;

    while (a <= 5) {
        println("#" + a++ + " : 조건형 반복문 while 테스트")
    }
}

fun doWhileExample() {
    var a = 1

    do {
        println("#" + a++ + " : 조건형 반복문 do-while 테스트")
    } while (a <= 0)
}

fun forExample(){

    println("-----증가하는 반복문----------")
    for (a in 1..9 step 2) {
        println("#$a : 범위형 반복문 for 테스트")
    }

    println("-----감소하는 반복문----------")
    for (b in 9 downTo 1 step 2) {
        println("#$b : 범위형 반복문 for 테스트")
    }

    println("-----문자가 증가하는 반복문----------")
    for (c in 'a'..'e') {
        println("#$c : 범위형 반복문 for 문자 테스트")
    }
}

class `6_반복문` {
    /*
     * 조건형 반복문 : 조건이 참인 경우 반복을 유지 (while, do-while)
     * 조건과 관계 없이 반드시 한 번은 실행해야 한다면, do-while 사용
     * 범위형 반복문 : 반복 범위를 정해 반복을 수행 (for)
     */

    /*
     * 증가 연산자 : ++a, a++ -> 값을 1 증가
     * 감소 연산자 : --a, a++ -> 값을 1 감소
     * 전위 연산자 : --a, ++a -> 연산자가 포함된 구문에서 이미 증감된 수를 반영하여 연산이 진행
     * 후위 연산자 : a--, a++ -> 증가나 감소된 수를 해당 구문에서 사용하지 않고 다음 구문부터 사용
     */
}