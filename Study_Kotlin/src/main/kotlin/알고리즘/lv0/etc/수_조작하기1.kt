package 알고리즘.lv0.etc

fun main() {
    println(수_조작하기1().solution(0, "wsdawsdassw"))
}
class 수_조작하기1 {
    fun solution(n: Int, control: String): Int = control.fold(n) {acc, c -> acc + if (c == 'w') 1 else if (c == 's') -1 else if (c == 'd') 10 else if (c == 'a') -10 else 0}
}