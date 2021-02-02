package algorithm.arrayqueue;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/1/29 18:11
 */
public class Array<E> {
	private E[] data;
	private int size;
	//构造函数，传入数组的容量capacity,构造Array
	public Array(int capacity){
		data = (E[]) new Object[capacity];
		size = 0;
	}
	// 无参数的构造函数，默认数组的容量capacity=10;
	public Array(){
		this(10);
	}

	//获取数组的容量
	public int getCapacity(){
		return data.length;
	}
	//获取数组中的元素个数
	public int getSize(){
		return size;
	}
	//返回数组是否为空
	public boolean isEmpty(){
		return size == 0;
	}

	//在index 索引的位置插入一个新元素e
	public void add(int index,E e){
		if(index <0 || index >size){
			throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");
		}
		if(size == data.length){
			resize(2 * data.length);
		}

	}


	//将数组空间的容量变成newCapacity 大小
	private void resize(int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newData[i] =data[i];
		}
		data= newData;
	}
}
