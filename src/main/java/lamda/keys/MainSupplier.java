package lamda.keys;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/18 9:26
 */
public class MainSupplier {
	public static void main(String[] args) {
//		Supplier<Double> supplier = () -> new Random().nextDouble();
//		System.out.println(supplier.get());
//		//可以使用方法引用
//		Supplier<Double> supplier1 = Math::random;
//		System.out.println(supplier1.get());

		Optional<Double> optional= Optional.empty();
		Supplier<Double> supplier2=()->new Random().nextDouble();
		System.out.println(optional.orElseGet(supplier2));
	}
}
