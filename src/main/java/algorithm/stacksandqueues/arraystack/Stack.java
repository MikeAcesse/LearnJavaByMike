package algorithm.stacksandqueues.arraystack;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/12 10:31
 */
public interface Stack<E> {
	int getSize();
	boolean isEmpty();
	void push(E e);
	E pop();
	E peek();
}
