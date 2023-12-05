package 이론;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class FilteringStream {
	public static void main(String[] args) {
		filtering();
	}

	static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	static int[] numbers = {1, 1, -1, 0, -3, 1, 2, -2, 2, 0};
	private static void filtering() {
		List<String> reverse = new ArrayList<>(List.of(days));
		Collections.reverse(reverse);

		System.out.println("< 퍼스트, 라스트 >");
		System.out.println("첫 번째 인자는 " + Arrays.stream(days).findFirst().orElse(null));
		// System.out.println("N으로 시작 하는 요일 : " + Arrays.stream(days).filter(day -> day.startsWith("N")).findFirst().orElseThrow()); -> NoSuchElementException
		System.out.println("N으로 시작 하는 요일 : " + Arrays.stream(days).filter(day -> day.startsWith("N")).findFirst().orElse(null));
		System.out.println("마지막 인자는 " +  reverse.stream().findFirst().orElse(null));
		// System.out.println("N으로 시작 하는 요일 :  " +  reverse.stream().findFirst().orElseThrow());
		System.out.println("N으로 시작 하는 요일 :  " +  reverse.stream().findFirst().orElse(null));

		System.out.println();

		System.out.println("< 필터 >");
		Arrays.stream(days).filter(day -> day.contains("S")).forEach(s -> System.out.print(s + " "));

		System.out.println();
		System.out.println();

		System.out.println("< 테이크 >");
		Arrays.stream(days).takeWhile(day -> day.length() == 6).forEach(s -> System.out.print(s + " "));
		System.out.println();
		reverse.stream().takeWhile(day -> day.startsWith("S")).forEach(s -> System.out.print(s + " ")); // 뒤집어진 채로 출력됨

		System.out.println();
		System.out.println();
		System.out.println("< 드롭 >");
		Arrays.stream(days).dropWhile(day -> day.length() < 9).forEach(s -> System.out.print(s + " "));
		System.out.println();
		reverse.stream().dropWhile(day -> day.length() < 9).forEach(s -> System.out.print(s + " ")); // 뒤집어진 채로 출력됨

		System.out.println();
		System.out.println();
		System.out.println("< 중복 제거 >");
		System.out.println(Arrays.toString(IntStream.of(numbers).distinct().toArray()));
	}
}
