package 알고리즘.lv0.etc;

import java.util.stream.IntStream;

public class 주사위_게임3_자바 {
	public static void main(String[] args) {
		System.out.println(solution(2, 2, 2, 2));
		System.out.println(solution(4, 1, 4, 4));
		System.out.println(solution(6, 3, 3, 6));
		System.out.println(solution(2, 5, 2, 6));
		System.out.println(solution(6, 4, 2, 5));
	}

	public static int solution(int a, int b, int c, int d) {
		int[] dice = new int[7];
		dice[a]++;
		dice[b]++;
		dice[c]++;
		dice[d]++;

		int answer = 0;
		int cnt = (int) IntStream.of(dice).filter(i -> i > 0).count();

		switch (cnt) {
			case 1 -> answer = 1111 * a;
			case 2 -> {
				int n = (int) IntStream.of(dice).filter(i -> i == 3).count();

				if(n == 1) { // 3, 1
					int p = IntStream.rangeClosed(0, 6).filter(i -> dice[i] == 3).findAny().orElse(0);
					int q = IntStream.rangeClosed(0, 6).filter(i -> dice[i] == 1).findAny().orElse(0);
					answer = (int) Math.pow(10 * p + q, 2);
				} else {
					int p = IntStream.rangeClosed(0, 6).filter(i -> dice[i] == 2).min().orElse(0);
					int q = IntStream.rangeClosed(0, 6).filter(i -> dice[i] == 2).max().orElse(0);
					answer = (p + q) * Math.abs(p - q);
				}
			}
			case 3 -> {
				int q = IntStream.rangeClosed(0, 6).filter(i -> dice[i] == 1).min().orElse(0);
				int r = IntStream.rangeClosed(0, 6).filter(i -> dice[i] == 1).max().orElse(0);
				answer = q * r;
			}
			case 4 -> answer = Math.min(Math.min(a, b), Math.min(c, d));
		}

		return answer;
	}
}
