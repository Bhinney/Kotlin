package 알고리즘.lv0.etc;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 수열과_구간_쿼리2_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {5, 4, 3, 2, 1}, new int[][] {{0, 4, 2}})));
		System.out.println(Arrays.toString(solution(new int[] {0, 1, 2, 4, 3}, new int[][] {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}})));
	}

	// s e k
	// s 보다 크고 e 보다 작은 i
	// k 보다 크면서 가장 작은 arr[i]
	// 답이 없으면 -1
	public static int[] solution(int[] arr, int[][] queries) {
		int[] answer = new int[queries.length];
		for (int i = 0; i < answer.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];

			answer[i] = IntStream.rangeClosed(s, e).map(num -> arr[num]).filter(num -> num > k).min().orElse(-1);
		}

		return answer;
	}
}
