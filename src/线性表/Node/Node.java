package 线性表.Node;

/**
 * 链表节点
 * @author jirafa
 */
public class Node<T> {
    public T t;
    public Node<T> next;

    public Node(T t, Node<T> next) {
        this.t = t;
        this.next = next;
    }

    public Node(T t) {
        this.t = t;
        this.next=null;
    }

    public Node() {
        this.next=null;
        this.t=null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "t=" + t +
                '}';
    }
}
