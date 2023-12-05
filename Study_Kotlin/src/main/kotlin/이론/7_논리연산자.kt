package 이론

fun main () {
    doubleForBreakExample()
    println("##############################")
    doubleForContinueExample()
}

fun doubleForBreakExample() {
    breakLoop@for(i in 1..5) {
        for (j in 1..3) {
            if (i == 2 && j == 2) break@breakLoop

            println("코틀린 다중 반복문 break 확인 : i는 $i 이고, j는 $j")
        }
    }
}

fun doubleForContinueExample() {
    continueLoop@for(i in 1 .. 5) {
        for (j in 1 .. 5) {
            if (j == i) continue@continueLoop

            println("코틀린 다중 반복문 continue 확인 : i는 $i 이고, j는 $j")
        }
    }
}

class `7_논리연산자` {

    /*
     * break : 반복문이 실행되는 중간에 반복문 즉시 종료
     * continue : 다음 반복문 조건으로 넘어감
     * 다중 반복문에서 종료 조건을 설정하고 break를 사용하면, 가까운 반복문만 끝나고 다른 반복문 또한 수동으로 종료해줘야함
     * 코틀린에서는 외부 반복문에 '레이블_이름 + @' 기호를 달고, break 문에서 '@ + 레이블_이름' 달면 레이블이 달린 반복문을 기준으로 즉시 반복문 종료
     * continue의 경우에도 마찬가지
     */
}