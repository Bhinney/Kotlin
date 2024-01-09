package 알고리즘.문자열;

public class 코드_처리하기_자바 {
	public static void main(String[] args) {
		System.out.println(solution("abc1abc1abc"));
	}
	public static String solution(String code) {
		StringBuilder answer = new StringBuilder();
		boolean mode = false; // 1과 0이니까 판별이 편하도록 불리언 값 사용

		for (int i = 0; i < code.length(); i++) {
			char c = code.charAt(i);

			if (mode) { // 1일 때, 홀수인 인덱스 값만 더하기
				if (c == '1') mode = false;
				else if (i % 2 != 0) answer.append(c);
			} else { // 0일 때, 짝수인 인덱스 값만 더하기
				if (c == '1') mode = true;
				else if (i % 2 == 0) answer.append(c);
			}
		}

		if (answer.toString().isEmpty()) return "EMPTY";

		return answer.toString();
	}
}
