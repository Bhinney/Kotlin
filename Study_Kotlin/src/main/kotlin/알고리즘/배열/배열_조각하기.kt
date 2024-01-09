package 알고리즘.배열

fun main () {
    println(배열_조각하기().solution(intArrayOf(0, 1, 2, 3, 4, 5), intArrayOf(4, 1, 2)).contentToString())
}
class 배열_조각하기 {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var ans = arr
        
        query.forEachIndexed { index, i ->
            ans = if (index % 2 == 0) ans.sliceArray(0 .. i)
                else ans.sliceArray(i .. ans.lastIndex)
        }

        return ans
    }
}