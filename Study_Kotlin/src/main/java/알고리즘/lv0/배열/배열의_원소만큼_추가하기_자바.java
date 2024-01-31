package 알고리즘.lv0.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열의_원소만큼_추가하기_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {5, 1, 4})));
	}
	public static int[] solution(int[] arr) {
		StringBuilder ans = new StringBuilder();
		for (int i : arr) {
			ans.append(String.valueOf(i + ":").repeat(i));
		}

		return Arrays.stream(ans.toString().split(":")).mapToInt(Integer::parseInt).toArray();
	}
	// public static int[] solution(int[] arr) {
	// 	List<Integer> ans = new ArrayList<>();
	//
	// 	for (int n : arr) {
	// 		for (int i = 0; i < n; i++) {
	// 			ans.add(n);
	// 		}
	// 	}
	//
	// 	return ans.stream().mapToInt(i -> i).toArray();
	// }
}
