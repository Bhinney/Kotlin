package 알고리즘.lv0.etc;

import java.util.HashSet;

public class 주사위게임2_자바 {
	public static void main(String[] args) {
		System.out.println(solution(2, 6, 1));
		System.out.println(solution(5, 3, 3));
		System.out.println(solution(4, 4, 4));
	}
	public static int solution(int a, int b, int c) {
		HashSet<Integer> set = new HashSet<>();
		set.add(a);
		set.add(b);
		set.add(c);

		int one = a + b + c;
		int two = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
		int three = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

		return switch (set.size()) {
			case 3 -> one;
			case 2 -> one * two;
			case 1 -> one * two * three;
			default -> -1;
		};
	}
}
