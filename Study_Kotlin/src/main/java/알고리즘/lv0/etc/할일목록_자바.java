package 알고리즘.lv0.etc;

import java.util.ArrayList;
import java.util.Arrays;

public class 할일목록_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"}, new boolean[]{true, false, true, false})));
	}

	public static String[] solution(String[] todo_list, boolean[] finished) {
		ArrayList<String> ans = new ArrayList<>();

		for (int i = 0; i < todo_list.length; i++) {
			if (!finished[i]) ans.add(todo_list[i]);
		}

		return ans.toArray(new String[0]);
	}
}
