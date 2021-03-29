package algorithm.arrayqueue;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/2/8 15:39
 */
public interface Queue<E> {
	int getSize();
	boolean isEmpty();
	void enqueue(E e);
	E dequeue();
	E getFront();
}
