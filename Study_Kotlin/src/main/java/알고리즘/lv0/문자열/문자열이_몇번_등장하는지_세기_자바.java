package 알고리즘.lv0.문자열;

public class 문자열이_몇번_등장하는지_세기_자바 {
	public static void main(String[] args) {
		System.out.println(solution("banana", "ana"));
	}

	public static int solution(String myString, String pat) {
		int ans = 0;

		for (int i = 0; i <= myString.length() - pat.length(); i++) {
			if (pat.equals(myString.substring(i, i + pat.length()))) ans++;
		}

		return ans;
	}
}
