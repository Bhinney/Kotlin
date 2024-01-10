package 알고리즘.lv0.연산;

public class 더_크게_합치기_자바 {
	public static void main(String[] args) {
		System.out.println(solution(9, 91));
	}

	public static int solution(int a, int b) {

		return Math.max(Integer.parseInt("" + a + b), Integer.parseInt("" + b + a));
	}
}
