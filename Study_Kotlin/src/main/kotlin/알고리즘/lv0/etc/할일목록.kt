package 알고리즘.lv0.etc

class 할일목록 {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String>
    = todo_list.filterIndexed { index, s ->  finished[index].not() }.toTypedArray()
}