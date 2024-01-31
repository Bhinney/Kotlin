package 알고리즘.lv0.배열

class 배열의_길이에_따른_연산하기 {
    fun solution(arr: IntArray, n: Int): IntArray {
        for (i in arr.lastIndex downTo 0 step 2) arr[i] += n
        return arr
    }
}