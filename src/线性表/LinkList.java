package 线性表;

import 线性表.Node.Node;

/**
 * 单链表
 * @author jirafa
 */
public class LinkList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public LinkList() {
        this.size=0;
        this.first =null;
        this.last =null;
    }

    /**
     * 头插法插入节点
     */
    public void  addFirst(T t){
        Node<T> node = new Node<T>(t);
        if(size==0){
            first=node;
            last=node;
        }else {
            node.next=first;
            first=node;
        }
        size++;
    }

    /**
     * 尾插法插入
     * @param t
     */
    public void addLast(T t){
        Node<T> node = new Node<>(t);
        if(size==0){
            first=node;
            last=node;
        }else {
            last.next=node;
            last=node;
        }
        size++;
    }

    public void add(T t,int index){
        Node<T> node = new Node<>(t);
        if(index>=size||index<0){
            throw new RuntimeException("下标错误");
        }
        if(index==0){
            addFirst(t);
            return;
        }
        if(index==size-1){
            addLast(t);
            return;
        }
        Node<T> pre=first;
        for (int i = 0; i < index - 1; i++) {
            pre=pre.next;
        }
        node.next=pre.next;
        pre.next=node;
        size++;
    }

    public void remove(int index){
        if(index < 0||index >=size ){
            throw new RuntimeException("下标错误");
        }
        if(index==0){
            removeFirst();
            return;
        }
        Node<T> pre=first;
        for (int i = 0; i < index - 1; i++) {
            pre=pre.next;
        }
        Node<T> aft=pre.next;
        pre.next=aft.next;
        size--;
    }

    public void removeFirst(){
        first=first.next;
        size--;
    }

    public void remove(T t){
        if(t.equals(first.t)){
            removeFirst();
        }else {
            Node<T> pre = first;
            while (pre.next != null) {
                if ((pre.next).t.equals(t)) {
                    break;
                }
                pre = pre.next;
            }
            if (pre.next == null) {
                throw new RuntimeException("未找到该元素");
            } else {
                Node<T> aft=pre.next;
                if(aft.equals(last)){
                    last=pre;
                }
                pre.next=aft.next;
            }
            size--;
        }
    }

    /**
     * 获取该位置的节点
     * @param index
     * @return T
     */
    public T get(int index){
        if(index>=size){
            throw new RuntimeException("下标越界");
        }
        Node<T> reNode=first;
        for (int i = 0; i < index; i++) {
            reNode=reNode.next;
        }
        return reNode.t;
    }

    public boolean contains(T t){
        Node<T> p=first;
        while (p!=null){
            if(t.equals(p.t))
                return true;
            p=p.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        Node<T> p=first;
        while (p!=null){
            list.append(p.t);
            p=p.next;
        }
        return "LinkList{" +
               list+ '}';
    }
}
