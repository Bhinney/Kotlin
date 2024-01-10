package 알고리즘.lv0.연산;

public class 두_수의_연산값_비교_자바 {
	public static void main(String[] args) {
		System.out.println(solution(2, 91));
	}
	public static int solution(int a, int b) {

		return Math.max(Integer.parseInt("" + a + b), 2 * a * b);
	}
}
