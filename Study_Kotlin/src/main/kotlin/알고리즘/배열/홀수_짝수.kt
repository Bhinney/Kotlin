package 알고리즘.배열

import kotlin.math.max

class 홀수_짝수 {
    fun solution(num_list: IntArray): Int
    = max(num_list.filterIndexed {index, i ->  index % 2 == 0 }.sum(), num_list.filterIndexed {index, i ->  index % 2 != 0 }.sum())
}