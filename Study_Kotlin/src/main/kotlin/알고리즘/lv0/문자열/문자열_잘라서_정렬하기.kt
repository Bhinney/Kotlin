package 알고리즘.lv0.문자열

class 문자열_잘라서_정렬하기 {
    fun solution(myString: String): Array<String> = myString.split("x").filter { it.isNotEmpty() }.sorted().toTypedArray()
}