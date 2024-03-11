package 알고리즘.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ2042_구간합구하기_자바 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// arr[0](n) : 개수, arr[1](m) : 수의 변경이 일어나는 횟수, arr[2](k) : 구간 합을 구하는 횟수
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int[] numbers = new int[arr[0]];
		for (int i = 0; i < arr[0]; i++)
			numbers[i] = Integer.parseInt(br.readLine());

		for (int i = 0; i < arr[1] + arr[2] - 1; i++) {
			int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] clone = numbers.clone();
		}

	}
}
