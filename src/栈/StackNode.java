package 栈;

public class StackNode<T> {
    private T t;
    private StackNode<T> next;

    public StackNode() {
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
