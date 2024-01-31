package 알고리즘.lv0.배열

import java.util.Stack

class 빈_배열에_추가_삭제하기 {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        val ans = Stack<Int>()
        for (i in arr.indices) {
            for (j in 0 until  arr[i] * if (flag[i]) 2 else 1) {
                if (flag[i]) ans.push(arr[i]) else ans.pop()
            }
        }

        return ans.toIntArray()
    }
}