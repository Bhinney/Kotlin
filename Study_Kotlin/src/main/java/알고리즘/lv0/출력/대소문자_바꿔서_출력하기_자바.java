package 알고리즘.lv0.출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 대소문자_바꿔서_출력하기_자바 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		br.close();
		StringBuilder sb = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (c >= 'A' && c <= 'Z') sb.append(String.valueOf(c).toLowerCase());
			else if (c >= 'a' && c <= 'z') sb.append(String.valueOf(c).toUpperCase());
		}

		bw.write(sb.toString());
		bw.close();
	}
}
