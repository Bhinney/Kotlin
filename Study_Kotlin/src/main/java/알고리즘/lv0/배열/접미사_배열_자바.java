package 알고리즘.lv0.배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 접미사_배열_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("banana")));
		System.out.println(Arrays.toString(solution("programmers")));
	}

	public static String[] solution(String my_string) {
		ArrayList<String> ans = new ArrayList<>();

		for (int i = 0; i < my_string.length(); i++) {
			ans.add(my_string.substring(i));
		}

		return ans.stream().sorted().toArray(String[]::new);
	}
}
