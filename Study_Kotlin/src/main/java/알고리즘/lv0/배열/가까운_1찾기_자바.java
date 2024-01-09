package 알고리즘.lv0.배열;

import java.util.stream.IntStream;

public class 가까운_1찾기_자바 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{0, 0, 0, 1}, 3));
		System.out.println(solution(new int[]{1, 0, 0, 1, 0, 0}, 4));
		System.out.println(solution(new int[]{1, 1, 1, 1, 0}, 3));
	}

	public static int solution(int[] arr, int idx) {

		return IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
	}
}
