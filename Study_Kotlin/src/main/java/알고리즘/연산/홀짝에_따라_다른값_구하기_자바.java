package 알고리즘.연산;

public class 홀짝에_따라_다른값_구하기_자바 {
	public static void main(String[] args) {
		System.out.println(solution(7));
		System.out.println(solution(10));
	}

	public static int solution(int n) {
		int ans = 0;
		for (int i = n; i >= 1; i -= 2) {
			ans += (n % 2 == 0) ? (int) Math.pow(i, 2) : i;
		}

		return ans;
	}
}
