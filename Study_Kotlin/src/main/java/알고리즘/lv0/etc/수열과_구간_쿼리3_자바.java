package 알고리즘.lv0.etc;

import java.util.Arrays;

public class 수열과_구간_쿼리3_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {0, 1, 2, 3, 4}, new int[][] {{0, 3}, {1, 2}, {1, 4}})));
	}
	public static int[] solution(int[] arr, int[][] queries) {
		for (int[] q : queries) {
			int tmp = arr[q[0]];
			arr[q[0]] = arr[q[1]];
			arr[q[1]] = tmp;
		}
		return arr;
	}
}