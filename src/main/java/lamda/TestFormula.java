package lamda;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/19 10:10
 */
public class TestFormula {
	public static void main(String[] args) {
		Formula formula = new Formula() {
			@Override
			public double calculate(int a) {
				return sqrt(a*100);
			}
		};
		System.out.println(formula.calculate(100));
		System.out.println(formula.calculate(16));
		System.out.println(formula.calculate(9));
	}
}
interface Formula{
	double calculate(int a);
	default double sqrt(int a){
		return Math.sqrt(a);
	}
}
