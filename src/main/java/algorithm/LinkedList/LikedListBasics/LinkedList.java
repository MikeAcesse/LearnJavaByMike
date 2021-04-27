package algorithm.LinkedList.LikedListBasics;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/26 14:52
 */
public class LinkedList<E>{
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
}
