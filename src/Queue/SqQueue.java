package Queue;

import java.util.Arrays;

public class SqQueue<T> {
    private int front;
    private int rear;
    private Object[] queue;

    public SqQueue() {
        this.queue=new Object[100];
        this.front=this.rear=0;
    }

    public SqQueue(int size) {
        this.queue = new Object[size+1];
        this.front=this.rear=0;
    }

    public void clear(){
        front=rear=0;
    }

    public boolean isEmpty(){
        return front==rear;
    }

    public int length(){
        return (rear-front+queue.length)%queue.length;
    }

    public T peek() throws Exception {
        if(front==rear)
            throw new Exception("空队列");
        return (T) queue[front];
    }

    /**
     * 入队
     */
    public void offer(T t) throws Exception {
        if((rear+1)% queue.length==front)
            throw new Exception("队列已满");
        queue[rear]=t;
        rear=(rear+1)%queue.length;
    }

    /**
     * 出队
     */
    public T poll() throws Exception {
        if(rear==front)
            throw new Exception("空队");
        T t = (T) queue[front];
        front=(front+1)%queue.length;
        return t;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i=front;
        while (i!=rear) {
            if ((i+1)% queue.length==rear)
                builder.append(queue[i]);
            else
                builder.append(queue[i]).append(",");
            i=(i+1)% queue.length;
        }
        return "SqQueue{"
                + builder +
                '}';
    }
}
