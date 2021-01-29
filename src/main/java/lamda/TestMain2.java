package lamda;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/19 10:00
 */
public class TestMain2 {
	public static void main(String[] args) {
		Converter<String,Integer> converter = (from) -> Integer.valueOf(from);
		//Converter<String,Integer> converter = (String from) -> {return  Integer.valueOf(from);};
		Integer converted = converter.convert("123");
		System.out.println(converted);
	}

	@FunctionalInterface
	interface Converter<F,T>{
		T convert(F from);
	}
}
