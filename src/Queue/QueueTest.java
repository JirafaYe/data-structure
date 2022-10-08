package Queue;

import List.Entity.Polinomial;
import Queue.Node.MyQueue;
import Stack.LinkedStack;

public class QueueTest {
    public static void main(String[] args) throws Exception {
//        LinkedQueue<Integer> queue = new LinkedQueue<>();
//        System.out.println("empty :"+queue.isEmpty());
////        System.out.println(queue.peek());
//        for (int i = 0; i < 10; i++) {
//            queue.offer(i);
//        }
//        System.out.println(queue);
//        System.out.println("peek:"+queue.peek());
//        System.out.println(queue.length());
//        System.out.println("poll:"+queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.length());
//        queue.offer(100);
//        System.out.println(queue);
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        myQueue.peek(); // return 1
        myQueue.pop(); // return 1, queue is [2]
        myQueue.empty(); // return false
    }

    private void testSqQueue() throws Exception {
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
