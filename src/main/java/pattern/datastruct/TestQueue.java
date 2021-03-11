package pattern.datastruct;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/30 16:22
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        for (String q : queue
        ) {
            System.out.println(q);
        }
        System.out.println("==========");
        System.out.println("poll= " + queue.poll()); //返回第一个元素，并在队列中删除
        for (String q : queue
        ) {
            System.out.println(q);
        }
        System.out.println("==========");
        System.out.println("element= " + queue.element()); //返回第一个元素
        for (String q : queue
        ) {
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("peek=" + queue.peek()); //返回第一个元素
        for (String q : queue) {
            System.out.println(q);
        }
    }
}
