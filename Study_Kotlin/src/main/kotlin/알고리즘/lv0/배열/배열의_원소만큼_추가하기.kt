package 알고리즘.lv0.배열

class 배열의_원소만큼_추가하기 {
    fun solution(arr: IntArray): IntArray = arr.flatMap { i -> List(i) {i} }.toIntArray()
}