package 알고리즘.lv0.문자열;

public class 조건_문자열_자바 {
	public static void main(String[] args) {
		System.out.println(solution("<", "=", 20, 50));
	}
	public static int solution(String ineq, String eq, int n, int m) {
		boolean check = true;

		switch (ineq + eq) {
			case ">=" -> check = n >= m;
			case ">" -> check = n > m;
			case "<=" -> check = n <= m;
			case "<" -> check = n < m;
		}

		return check ? 1 : 0;
	}
}
