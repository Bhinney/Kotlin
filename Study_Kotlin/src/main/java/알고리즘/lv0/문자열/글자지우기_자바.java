package 알고리즘.lv0.문자열;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 글자지우기_자바 {
	public static void main(String[] args) {
		System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
	}
	public static String solution(String my_string, int[] indices) {
		String[] ans = my_string.split("");
		for (int i : indices) {
			ans[i] = "";
		}

		return String.join("", ans).replaceAll(" ", "");
	}
}
