package 알고리즘.lv0.etc

class 수열과_구간_쿼리1 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray
    = arr.apply { queries.map { (s, e) -> (s .. e).forEach { arr[it]++ } } }
}