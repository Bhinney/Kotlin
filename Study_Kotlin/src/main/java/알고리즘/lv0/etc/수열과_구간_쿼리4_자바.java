package 알고리즘.lv0.etc;

import java.util.Arrays;

public class 수열과_구간_쿼리4_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}})));
	}

	// [s, e, k]
	// s <= i <= e
	// arr[i]가 k의 배수이면 1 더하기
	public static int[] solution(int[] arr, int[][] queries) {
		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];

			for (int j = s; j <= e; j++) {
				if (j % k == 0) arr[j] += 1;
			}
		}
		return arr;
	}
}
