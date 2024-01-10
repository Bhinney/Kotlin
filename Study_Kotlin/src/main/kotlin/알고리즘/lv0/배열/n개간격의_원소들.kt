package 알고리즘.lv0.배열

class n개간격의_원소들 {
    fun solution(num_list: IntArray, n: Int): IntArray
    = num_list.slice(0..num_list.lastIndex step n).toIntArray()
}