package 알고리즘.lv0.배열;

import java.util.Arrays;

public class 배열만들기1_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(10, 3)));
		System.out.println(Arrays.toString(solution(15, 5)));
	}
	public static int[] solution(int n, int k) {
		int[] answer = new int[n / k];

		for (int i = k ; i <= n; i += k) {
			answer[i / k - 1] = i;
		}

		return answer;
	}
}
