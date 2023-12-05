package 이론.자바와비교;

public class BreakAndContinue {
	public static void main(String[] args) {
		// breakExample();
		continueExample();
	}

	private static void breakExample () {
		for (int i = 1; i <= 5 ; i++) {
			if (i == 3) break;

			System.out.printf("자바 반복문 내에서 브레이크 확인 : 지금 i값은 %d%n", i);
		}

		System.out.println("##########################################");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) break;

				System.out.printf("자바 내에서 중첩 반복문 브레이크 확인 : i는 %d%n이고 j는 %d%n ", i, j);
			}
		}
	}

	private static void continueExample() {
		for (int i = 1; i <= 5; i++) {
			if (i % 2 == 0) continue;

			System.out.printf("자바 반복문 내에서 컨티뉴 확인 : 지금 i값은 %d%n", i);
		}

		System.out.println("##########################################");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j % i == 0) continue;

				System.out.printf("자바 중첩 반복문 내에서 컨티뉴 확인 : i는 %d%n이고 j는 %d%n ", i, j);
			}
		}
	}
}
