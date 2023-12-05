package 이론

fun main() {
    var a : Int = 123
    var b : Int
    b = 1004
    var c : Int ?= null /* null을 변수로 선언 할 수 있음 , NPE 발생 가능 */
    println(a)
    println(b)
    println(c)

    /****/

    var intValue : Int = 1234
    var longValue : Long = 1234L
    var intValueByHex : Int = 0x1af /* 16진수는 앞에 0x를 붙이면 됨 */
    var intValueByBin : Int = 0b10110110 /* 2진수는 앞에 0b를 붙이면 됨 */
    var doubleValue : Double = 123.5
    var doubleValueWithExp : Double = 123.5e10 /* 지수 표기 */
    var floatValue : Float = 123.5f

    var oneMillion = 1_000_000
    println(oneMillion)

    var charValue : Char = 'a'
    var koreanCharValue : Char = '가'

    var trueValue : Boolean = true
    var falseValue : Boolean = false

    var stringValue : String = "문자열 변수 확인"
    var multiStringValue : String = """여러 줄의
        문자열을
        쓰는 방법은
        큰 따옴표를 
        세 개 쓰기 
        특수 문자나 줄바꿈도 가능 """

    var test : String = """
        ₩t
    """

}

class `1_기초문법` {
    /*
	 * var : 일반적으로 통용되는 변수, 언제든지 읽기 쓰기가 가능
	 * val : 선언시에만 초기화 가능, 중간에 값을 변경할 수 없음
	 */

    /*
     * Kotlin 은 기본 변수에서 null 값을 허용하지 않음
     * 변수에 값을 할당하지 않은 채로 사용하게 되면 문법 에러를 표시하고 컴파일을 막아줌
     * NPE 를 원천적으로 차단해줌
     */


    /*v
     * 기본 자료형은 자바와 비슷
     * Byte : 8bits
     * Short : 16bits
     * Float : 32bits
     * Double : 64bits
     * 정수형의 리터럴 : 10진수 16진수 2진수 표기
     */

    /*
    * 코틀린은 8진수의 표기를 지원하지 않음
    * 코틀린은 내부적으로 문자열을 UTF-16BE로 관리
    * 글자 하나 하나가 2바이트의 메모리 공간을 사용
    * 아래와 같은 특수 문자 지원
    * ₩t : 탭
    * ₩b : 백스탭
    * ₩r : 첫 열로 커서 옮김
    * ₩n : 개행
    * ₩' : 작은 따옴표
    * ₩" : 큰 따옴표
    * ₩₩ : 역 슬래시
    * ₩$ : $ 문자
    * ₩uxxxxx : 유니코드 문자
    */
}