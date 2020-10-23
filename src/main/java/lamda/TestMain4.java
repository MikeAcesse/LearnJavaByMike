package lamda;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/19 10:35
 */
public class TestMain4 {
	public static void main(String[] args) {
		Converter<String,Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);
	}

	@FunctionalInterface
	interface Converter<F,T>{
		T convert(F from);
	}
}
