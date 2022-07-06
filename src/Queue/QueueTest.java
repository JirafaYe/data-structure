package Queue;

import List.Entity.Polinomial;

public class QueueTest {
    public static void main(String[] args) throws Exception {
        SqQueue<Integer> queue = new SqQueue<>(10);
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
        System.out.println(queue);
        System.out.println("peek:"+queue.peek());
        System.out.println(queue.length());
        System.out.println("poll:"+queue.poll());
        System.out.println(queue);
        System.out.println(queue.length());
        queue.offer(100);
        System.out.println(queue);
    }
}
