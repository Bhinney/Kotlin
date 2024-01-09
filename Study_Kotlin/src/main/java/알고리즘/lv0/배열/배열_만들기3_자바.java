package 알고리즘.lv0.배열;

import java.util.Arrays;

public class 배열_만들기3_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})));
	}

	public static int[] solution(int[] arr, int[][] intervals) {
		return Arrays.stream(intervals).flatMapToInt(nums -> Arrays.stream(Arrays.copyOfRange(arr, nums[0], nums[1] + 1))).toArray();
	}
}
