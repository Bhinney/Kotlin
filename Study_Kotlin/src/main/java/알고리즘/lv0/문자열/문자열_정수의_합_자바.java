package 알고리즘.lv0.문자열;

public class 문자열_정수의_합_자바 {
	public int solution(String num_str) {
		int ans = 0;
		for (char ch : num_str.toCharArray()) {
			ans += Character.getNumericValue(ch);
		}

		return ans;
	}
}
