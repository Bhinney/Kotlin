package 알고리즘.lv0.문자열

class 간단식_계산하기 {
    fun solution(binomial: String): Int {
        val arr = binomial.split(" ")
       return when (arr[1]) {
            "+" -> arr[0].toInt() + arr[2].toInt()
            "-" -> arr[0].toInt() - arr[2].toInt()
            "*" -> arr[0].toInt() * arr[2].toInt()
           else -> {0}
       }
    }
}