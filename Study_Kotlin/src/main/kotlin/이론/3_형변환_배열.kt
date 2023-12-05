package 이론

fun main() {
    var a : Int = 1024
    var b : Long = a.toLong()

    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullArr = arrayOfNulls<Int>(5)
    nullArr[3] = 10

    var emptyArr = emptyArray<Int>()
    println(nullArr.contentToString())
    println(emptyArr.contentToString())
}

class `3_형변환_배열` {
    /*
     * 코틀린에서 제공하는 형변환 함수 -> to + 변환될_자료형()
     * toByte()
     * toShort()
     * toInt()
     * toLong()
     * toFloat()
     * toDouble()
     * toChar
     * "명시적 형변환" VS "암시적 형변환"
     * 명시적 형변환 : 변환될 자료형을 개발자가 직접 지정함
     * 암시적 형변환 : 변수 할당 시 자료형을 지정하지 않아도 자동으로 형변환 됨
     * 코틀린은 형변환시 발생할 수 있는 오류를 막기 위해 다른 언어가 지원하는 암시적 형변환은 지원하지 않음
     */

    /*
     * 배열은 arrayOf, arrayOfNulls<T>(size) 등으로 생성 가능
     * 배열은 처음 선언했을 때의 전체 크기를 변경할 수 없다는 단점
     * 한 번 선언하면 빠른 입출력이 가능
     */
}