package 알고리즘.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class 평균점수_자바 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = Math.max(sc.nextInt(), 40);
		}
		System.out.println((int) Arrays.stream(arr).average().orElse(0));
	}
}
