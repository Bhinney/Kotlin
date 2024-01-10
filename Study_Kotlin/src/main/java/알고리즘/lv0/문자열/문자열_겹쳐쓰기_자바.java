package 알고리즘.lv0.문자열;

public class 문자열_겹쳐쓰기_자바 {
	public static void main(String[] args) {
		System.out.println(solution("He11oWor1d", "lloWorl", 2));
		System.out.println(solution("Program29b8UYP", "merS123", 7));
	}

	public static String solution(String my_string, String overwrite_string, int n) {
		String ans = my_string.substring(0, n) + overwrite_string;

		return ans + my_string.substring(ans.length());
	}
}
