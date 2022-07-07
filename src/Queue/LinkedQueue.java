package Queue;

import Queue.Node.QueueNode;

public class LinkedQueue<T> {
    private QueueNode<T> front;
    private QueueNode<T> rear;
    private int length;

    public LinkedQueue(T t) {
        QueueNode<T> newNode = new QueueNode<>(t);
        this.front=this.rear=newNode;
        this.length=1;
    }

    public LinkedQueue() {
        this.front=this.rear=null;
        this.length=0;
    }

    public int length(){
        return length;
    }

    public void clear(){
        front=rear=null;
        length=0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void offer(T t){
        QueueNode<T> node = new QueueNode<>(t);
        if(length==0){
            front=rear=node;
        }else {
            rear.next=node;
            rear=node;
        }
        length++;
    }

    public T peek() throws Exception {
        if(front==null)
            throw new Exception("空队");
        return front.t;
    }

    public T poll() throws Exception {
        if(front==null)
            throw new Exception("空队");
        T t = front.t;
        front=front.next;
        length--;
        return t;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        QueueNode<T> node=front;
        while (node.next!=null)
        {
            builder.append(node.t).append(",");
            node=node.next;
        }
        builder.append(node.t);
        return "LinkedQueue{" +
                builder
                +"}";
    }
}
