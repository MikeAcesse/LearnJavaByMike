package pattern.datastruct;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/30 14:48
 */
public class StackDemo {
	static void showpush(Stack<Integer> st, int a){
		st.push(new Integer(a));
		System.out.println("push("+a+")");
		System.out.println("stack: "+st);

	}
	static void showpop(Stack<Integer>st){
		System.out.println("pop -> ");
		Integer a = (Integer) st.pop();
		System.out.println(a);
		System.out.println("stack: "+st);

	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		System.out.println("stack: " + st);
		showpush(st, 42);
		showpush(st, 66);
		showpush(st, 99);
//		 showpop(st);
//		 showpop(st);
//		 showpop(st);
//		 try{
//		 	showpop(st);
//		 }catch (EmptyStackException e){
//			 System.out.println("empty stack");
//		 }
	     int index = st.search(new Integer("42"));
		System.out.println("index= "+ index);
		boolean result = st.empty();
		System.out.println(result);
		Integer pe = st.peek();
		System.out.println(pe);
		System.out.println(st);
	}

}
