package algorithm.binarysearchtree.binarysearchtreebasic;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/8/13 9:10
 */
public class BST <E extends Comparable<E>>{
	private class Node{
		public E e;
		public Node left,right;
		public Node(E e){
			this.e = e;
			left=null;
			right=null;
		}
	}

	private Node root;
	private int size;

	public BST(){
		root=null;
		size = 0;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}
}
