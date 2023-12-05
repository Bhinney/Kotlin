package 알고리즘.문자열;

public class 문자열_섞기_자바 {
	public static void main(String[] args) {
		System.out.println();
	}

	public String solution(String str1, String str2) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str1.length(); i++) {
			sb.append(str1.charAt(i));
			sb.append(str2.charAt(i));
		}

		return sb.toString();
	}
}
