package Queue.Node;

public class QueueNode<T> {
    public QueueNode<T> next;
    public T t;

    public QueueNode(T t) {
        this.t = t;
    }

    public QueueNode(QueueNode<T> next, T t) {
        this.next = next;
        this.t = t;
    }

    public QueueNode(){
    }

    @Override
    public String toString() {
        return "QueueNode{" +
                "t=" + t +
                '}';
    }
}
