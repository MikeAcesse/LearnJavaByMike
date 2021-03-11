package imooclambda;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/11 9:26
 */
public class App5 {
	public static void main(String[] args) {
		Test t = (msg) -> System.out.println(msg);
		t.test("lambda!");
	}
}

interface Test{
	void test(String msg);
}
