package algorithm.LinkedList.A2AddInLinkedList;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/27 18:10
 */
public class Main {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		String name ="fan";
		String name1 ="zhi";
		String name2="kang";
		linkedList.addFirst(name);
		linkedList.add(0,name1);
		linkedList.addLast(name2);
		System.out.println(linkedList);

	}
}
