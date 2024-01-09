package 알고리즘.lv0.배열;

import java.util.Arrays;
import java.util.HashSet;

public class 배열_만들기2_자바 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, 555)));
	}

	public static int[] solution(int l, int r) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = l; i <= r; i++) {
			String num = i + "";
			if (!num.contains("5")) continue;

			int cnt = (int)num.chars().filter(n -> n == 48 || n == 53).count();
			if (cnt == num.length()) set.add(i);
		}

		if (set.isEmpty()) set.add(-1);

		return set.stream().sorted().mapToInt(n -> n).toArray();
	}
}
