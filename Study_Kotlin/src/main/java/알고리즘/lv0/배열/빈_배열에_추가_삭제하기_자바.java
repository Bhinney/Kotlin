package 알고리즘.lv0.배열;

import java.util.Arrays;

public class 빈_배열에_추가_삭제하기_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {3, 2, 4, 1, 3}, new boolean[] {true, false, true, false, false})));
	}
	public static int[] solution(int[] arr, boolean[] flag) {
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) ans.append(String.valueOf(arr[i] + "&").repeat(arr[i] * 2));
			else ans.delete(ans.length() - arr[i] * 2, ans.length());
		}

		return Arrays.stream(ans.toString().split("&")).mapToInt(Integer::parseInt).toArray();
	}
}
