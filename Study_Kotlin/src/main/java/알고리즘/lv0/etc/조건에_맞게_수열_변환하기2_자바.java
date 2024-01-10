package 알고리즘.lv0.etc;


public class 조건에_맞게_수열_변환하기2_자바 {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 2, 3, 100, 99, 98}));
	}

	public static int solution(int[] arr) {
		int[] before = new int[arr.length];
		int ans = 0;
		int cnt = 0;

		while (cnt != before.length) {
			cnt = 0;
			before = arr.clone();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
				else if (arr[i] < 50 && arr[i] % 2 != 0) arr[i] = arr[i] * 2 + 1;

				if (arr[i] == before[i]) cnt++;
			}

			ans++;
		}

		return ans - 1;
	}
}
