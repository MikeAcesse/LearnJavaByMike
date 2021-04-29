package algorithm.LinkedList.A4QueryUpdate;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/28 19:57
 */
public class Main {
	public static void main(String[] args) {
		LinkedList  linkedList = new LinkedList();
		String name ="fan";
		String name1 ="zhi";
		String name2="kang";
		String name3="wang";
		String name4="tao";
		String name5="zhang";
		String name6="bo";
		linkedList.addFirst(name);
		linkedList.add(0,name1);
		linkedList.addLast(name2);
		linkedList.addLast(name3);
		linkedList.addLast(name4);
		linkedList.addLast(name5);
		linkedList.addLast(name6);
		System.out.println(linkedList.toString());

		String e = (String)linkedList.get(2);
		System.out.println(e);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.getSize());
		linkedList.set(1,"baba");
		System.out.println(linkedList.toString());
	}
}
