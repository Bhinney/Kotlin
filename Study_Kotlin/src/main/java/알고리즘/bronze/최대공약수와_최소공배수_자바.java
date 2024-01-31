package 알고리즘.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 최대공약수와_최소공배수_자바 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();

		int gcd = gcd(arr[0], arr[1]);
		System.out.println(gcd);
		System.out.println((arr[0] * arr[1]) / gcd);
	}

	private static int gcd(int n, int m) {
		return m != 0 ? gcd(m, n % m) : n;
	}
}
