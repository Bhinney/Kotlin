package 알고리즘.배열

fun main() {
    println(배열_비교하기().solution(intArrayOf(49, 13), intArrayOf(70, 11, 2)))
    println(배열_비교하기().solution(intArrayOf(100, 17, 84, 1), intArrayOf(55, 12, 65, 36)))
    println(배열_비교하기().solution(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 3, 3, 3, 3)))
}
class 배열_비교하기 {
    fun solution1(arr1: IntArray, arr2: IntArray): Int {
        if (arr1.size == arr2.size)
            return if (arr1.sum() == arr2.sum()) 0
            else if (arr1.sum() > arr2.sum()) 1 else -1

        return if (arr1.size > arr2.size) 1 else -1
    }

    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var ans = arr1.size.compareTo(arr2.size)
        if (ans == 0) ans = arr1.sum().compareTo(arr2.sum())
        return ans
    }
}