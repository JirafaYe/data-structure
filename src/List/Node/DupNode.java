package List.Node;

import java.util.Objects;

public class DupNode<T> {
    public T t;
    public DupNode<T> next;
    public DupNode<T> prior;

    public DupNode() {
        this.next=null;
        this.prior=null;
        this.t=null;
    }

    public DupNode(T t) {
        this.t = t;
        this.next=null;
        this.prior=null;
    }

    public DupNode(T t, DupNode<T> next, DupNode<T> prior) {
        this.t = t;
        this.next = next;
        this.prior = prior;
    }

    @Override
    public String toString() {
        return "DupNode{" +
                "t=" + t +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DupNode<?> dupNode = (DupNode<?>) o;
        return Objects.equals(t, dupNode.t) && Objects.equals(next, dupNode.next) && Objects.equals(prior, dupNode.prior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, next, prior);
    }
}
