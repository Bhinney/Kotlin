package 알고리즘.lv0.배열

class ad_제거하기 {
    fun solution(strArr: Array<String>): Array<String>
    = strArr.filter { s -> !s.contains("ad") }.toTypedArray()
}