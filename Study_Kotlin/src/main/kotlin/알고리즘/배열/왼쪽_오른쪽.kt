package 알고리즘.배열

fun main() {
    println(왼쪽_오른쪽().solution(arrayOf("u", "u", "l", "r")).contentToString())
    println(왼쪽_오른쪽().solution(arrayOf("u", "u", "y", "y")).contentToString())
}
class 왼쪽_오른쪽 {
    fun solution(str_list: Array<String>): Array<String> {
        if (!str_list.contains("r") && !str_list.contains("l")) return emptyArray()

        val l_idx : Int = (str_list.indices).firstOrNull { i:Int -> str_list[i].equals("l") } ?: Int.MAX_VALUE
        val r_idx : Int = (str_list.indices).firstOrNull { i:Int -> str_list[i].equals("r") } ?: Int.MAX_VALUE

        return if (l_idx < r_idx) str_list.sliceArray(0 .. l_idx - 1 ) else str_list.sliceArray(r_idx + 1 .. str_list.lastIndex)
    }


    // 런타임 에러 -> 자바 solution1이랑 같은 문항...
    fun solution1(str_list: Array<String>): Array<String> {
        var l_idx : Int = str_list.indexOf("l")
        var r_idx : Int = str_list.indexOf("r")

        if (r_idx == -1) r_idx = Int.MAX_VALUE
        if (l_idx == -1) l_idx = Int.MAX_VALUE

        return if (l_idx < r_idx) str_list.sliceArray(0 .. l_idx - 1) else str_list.sliceArray(r_idx + 1 .. str_list.lastIndex)
    }
}

