package 알고리즘.lv0.배열;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트_자르기_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));
		System.out.println(Arrays.toString(solution(4, new int[] {1, 5, 2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));
	}
	public static int[] solution(int n, int[] slicer, int[] num_list) {

		switch (n) {
			case 1 -> {
				return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
			}
			case 2 -> {
				return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
			}
			case 3 -> {
				return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
			}
			default -> {
				ArrayList<Integer> ans = new ArrayList<>();
				for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
					ans.add(num_list[i]);
				}

				return ans.stream().mapToInt(i -> i).toArray();
			}
		}
	}
}
