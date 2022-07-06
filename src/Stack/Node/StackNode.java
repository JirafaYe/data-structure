package Stack.Node;

public class StackNode<T> {
    public T t;
    public StackNode<T> next;

    public StackNode() {
        this.t=null;
        this.next=null;
    }

    public StackNode(T t) {
        this.t = t;
    }

    public StackNode(T t, StackNode<T> next) {
        this.t = t;
        this.next = next;
    }

    @Override
    public String toString() {
        return "StackNode{" +
                "t=" + t +
                '}';
    }
}
