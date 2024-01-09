package 알고리즘.연산;

import java.util.stream.IntStream;

public class 등차수열_특정항만_더하기_자바 {
	public static void main(String[] args) {
		System.out.println(solution(3, 4 , new boolean[]{true, false, false, true, true}));
		System.out.println(solution(7, 1 , new boolean[]{false, false, false, true, false, false, false}));
	}

	public static int solution1(int a, int d, boolean[] included) {
		int answer = 0;

		for (int i = 0; i < included.length; i++) {
			if (included[i]) answer += a + i * d;
		}

		return answer;
	}

	public static int solution(int a, int d, boolean[] included) {
		return IntStream.range(0, included.length).map(i -> included[i] ? a + i * d : 0).sum();
	}
}
