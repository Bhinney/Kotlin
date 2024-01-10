package 알고리즘.lv0.출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자열_반복해서_출력하기_자바 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int n = br.read();
		br.close();

		StringBuffer sb = new StringBuffer();
		sb.append(String.valueOf(str).repeat(Math.max(0, n)));

		bw.write(sb.toString());
		bw.close();
	}
}
