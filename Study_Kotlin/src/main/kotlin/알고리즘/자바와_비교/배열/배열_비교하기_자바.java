package 알고리즘.자바와_비교.배열;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열_비교하기_자바 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{49, 13}, new int[]{70, 11, 2}));
		System.out.println(solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
		System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));
	}

	public static int solution1(int[] arr1, int[] arr2) {
		if (arr1.length == arr2.length) {
			int sum1 = Arrays.stream(arr1).sum();
			int sum2 = Arrays.stream(arr2).sum();

			if (sum1 == sum2) return 0;
			else return sum1 > sum2 ? 1 : -1;
		}

		return arr1.length > arr2.length ? 1 : -1;
	}
	public static int solution(int[] arr1, int[] arr2) {
		int ans = Integer.compare(arr1.length, arr2.length);
		if (ans == 0) {
			ans = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
		}

		return ans;
	}
}
