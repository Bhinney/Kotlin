package 알고리즘.lv0.문자열

class 세_개의_구분자 {
    fun solution(myStr: String): Array<String> {
        val ans = myStr.split("[abc]+".toRegex()).filter { it.isNotEmpty() }.toTypedArray()
        return if (ans.isNotEmpty()) ans else arrayOf("EMPTY")
    }
}