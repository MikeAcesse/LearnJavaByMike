package algorithm.LinkedList.A3dummyHead;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/28 19:35
 */
public class LinkedList<E> {
	private class Node{
		public E e;
		public Node next;

		public Node(E e,Node next){
			this.e = e;
			this.next = next;
		}

		public Node(E e){
			this(e,null);
		}

		public Node(){
			this(null,null);
		}

		@Override
		public String toString() {
			return e.toString();
		}
	}
	private Node dummyHead;
	private int size;

	public LinkedList(){
		dummyHead = new Node();
		size = 0;
	}

	//获取链表中的元素个数
	public int getSize(){
		return size;
	}

	//返回链表是否为空
	public boolean isEmpty(){
		return size == 0;
	}

	//在链表的index(0-based)位置添加新元素e
	//在链表中不是一个常用的操作，练习用
	public void add(int index,E e){
		if(index < 0 || index > size){
			throw new IllegalArgumentException("Add Failed. Illegal index");

		}
		Node prev = dummyHead;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		prev.next = new Node(e,prev.next);
		size ++;
	}

	//在链表头添加新的元素e
	public void addFirst(E e){
		add(0,e);
	}

	//在链表末尾添加新的元素e
	public void addLast(E e){
		add(size,e);
	}
}
