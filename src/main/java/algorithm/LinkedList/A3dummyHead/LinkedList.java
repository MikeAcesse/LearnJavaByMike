package algorithm.LinkedList.A3dummyHead;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/28 19:35
 */
public class LinkedList<E> {
	private class Node{
		public E e;
		Node next;

		public Node(E e , Node next){
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

	//获取链表中的元素的个数
	public int getSize(){
		return  size ;

	}

	//返回链表是否为空
	public boolean isEmpty(){
		return size ==0;
	}
	//在链表的index(0-based)位置添加新的元素e
	//在链表中不是一个常用的操作
	public void add(int index, E e){
		if(index < 0 || index >size){
			throw new IllegalArgumentException("Add failed. Illegal index");
		}
		Node prev = dummyHead;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		prev.next = new Node(e, prev.next);
		size ++;
	}

	public void addFirst(E e){
		add(0,e);
	}

	public void addLast(E e){
		add(size,e);
	}

	//获得链表中第index（0-based） 个位置的元素
	//在链表中不是一个常用的操作
	public E get(int index){
		if(index < 0 || index >=size){
			throw new IllegalArgumentException("Get failed. Illegal index");
		}
		Node cur = dummyHead.next;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
		return cur.e;
	}

	public E getFirst(){
		return get(0);
	}
	public E getLast(){
		return get(size-1);
	}

	//修改链表的第index(0-based)个位置的元素e
	//在链表中不是一个很常用的操作
	public void set(int index,E e){
		if(index < 0 || index >=size){
			throw new IllegalArgumentException("Get failed. Illegal index");
		}
		Node cur = dummyHead.next;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
		cur.e = e;
	}

	//查找链表中是否有元素e
	public boolean contains(E e){
		Node cur = dummyHead.next;
		while(cur !=null){
			if(cur.e.equals(e)){
				return  true;
			}
			cur = cur.next;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		Node cur = dummyHead.next;
		while(cur != null){
			res.append(cur +"->");
			cur = cur.next;
		}
		res.append("NULL");
		return res.toString();
	}
}
