package 알고리즘.lv0.배열

class 뒤에서_5등까지 {
    fun solution(num_list: IntArray): IntArray = num_list.sorted().take(5).toIntArray()
}