package classloader.clazz;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/26 9:38
 */
public class ClassLoaderTest2 {
	public static void main(String[] args) {
		ClassLoader cl = Test.class.getClassLoader();
		System.out.println("ClassLoader is: "+cl.toString());
		System.out.println("ClassLoader\'s parent is: "+cl.getParent().toString());
		System.out.println("ClassLoader\'s  grand father is: "+cl.getParent().getParent().toString());
	}
}
