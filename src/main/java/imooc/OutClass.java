package imooc;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/23 18:17
 *
 * 成员内部类
 */
public class OutClass {
   private String name;
   private int age;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	private String str;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void outerDisplay(){
		System.out.println("outClass...");
	}

	public class InnerClass{
		public void innerDisplay(){
			//使用外围类的属性
			str = "fanzhikang";
			System.out.println(str);
			//使用外围类的方法
			outerDisplay();
		}

	}
    //推荐使用getXXX() 来获取成员内部类，尤其是该内部类的构造函数是无参时
	public InnerClass getInnerClass(){
		return new InnerClass();
	}

	public static void main(String[] args) {
		OutClass outer = new OutClass();
		OutClass.InnerClass inner = outer.getInnerClass();
		inner.innerDisplay();
	}
}
