package 알고리즘.lv0.etc;

public class 수열과_구간_쿼리1_자바 {
	public int[] solution(int[] arr, int[][] queries) {

		for (int[] q : queries) {
			for (int i = q[0]; i < q[1]; i++) arr[i]++;
		}

		return arr;
	}
}
