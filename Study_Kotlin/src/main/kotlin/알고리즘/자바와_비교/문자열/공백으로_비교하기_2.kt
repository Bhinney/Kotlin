package 알고리즘.자바와_비교.문자열

//fun main() {
//    println(공백으로_비교하기_2().solution(" i    love  you").contentToString())
//}
class 공백으로_비교하기_2 {
    fun solution(my_string: String): Array<String> = my_string.split(" ").filter { it.isNotEmpty() }.toTypedArray()
}