package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/19 9:42
 */
public class TestMain {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter","anna","mike","xenia");
		System.out.println(names);
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return b.compareTo(a);
			}
		});
		System.out.println(names);

		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		System.out.println(names);
	}
}
