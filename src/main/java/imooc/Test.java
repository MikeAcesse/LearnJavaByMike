package imooc;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/23 18:07
 */
public class Test {
	public void test(Bird bird){
		System.out.println(bird.getName()+"能够飞 "+bird.fly()+"米");
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.test(new Bird() {
			@Override
			public int fly() {
				return 10000;
			}

			@Override
			public String getName() {
				return "大雁";
			}
		});
	}
}
