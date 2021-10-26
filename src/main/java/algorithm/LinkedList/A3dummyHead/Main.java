package algorithm.LinkedList.A3dummyHead;



/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/28 19:35
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
	}
}
