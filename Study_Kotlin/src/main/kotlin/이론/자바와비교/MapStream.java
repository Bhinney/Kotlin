package 이론.자바와비교;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

public class MapStream {
	public static void main(String[] args) {
		mapExample();
	}

	private static void mapExample() {
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

		System.out.println("< map() 함수를 사용 했을 때 >");
		Arrays.stream(days).map(day -> "오늘은 " + day).forEach(System.out::println);

		System.out.println();

		System.out.println("< null 값이 있을 때 >");
		Arrays.stream(days).map(day -> {
			if (day.length() > 6) return day;
			else return null;
		}).forEach(System.out::println);

		System.out.println();

		System.out.println("< null 값이 없을 때 >");
		Arrays.stream(days).map(day -> {
			if (day.length() > 6) return day;
			else return null;
		}).filter(Objects::nonNull).forEach(System.out::println);

		System.out.println();

		System.out.println("< Index를 사용 했을 때>");
		IntStream.range(0, days.length).mapToObj(idx -> idx + "번째 요일 : " + days[idx]).forEach(System.out::println);

		System.out.println();

		System.out.println("< flatMap()을 사용 했을 때>");
		Arrays.stream(days).flatMap( s -> Arrays.stream(s.split(""))).forEach(r -> System.out.print("#" + r + " "));
	}
}
