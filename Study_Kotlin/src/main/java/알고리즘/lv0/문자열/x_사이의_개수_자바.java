package 알고리즘.lv0.문자열;

import java.util.Arrays;

public class x_사이의_개수_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("oxooxoxxox"))); // [1, 2, 1, 0, 1, 0]
	}

	public static int[] solution(String myString) {
		return Arrays.stream(myString.split("x", myString.length()))
			.mapToInt(String::length)
			.toArray();
	}

	// public static int[] solution(String myString) {
	// 	String[] arr = myString.split("x");
	// 	int len = arr.length;
	// 	if (myString.charAt(myString.length() - 1) == 'x') len++;
	// 	int[] ans = new int[len];
	//
	// 	for (int i = 0; i < arr.length; i++) {
	// 		ans[i] = arr[i].length();
	// 	}
	//
	// 	return ans;
	// }
}
