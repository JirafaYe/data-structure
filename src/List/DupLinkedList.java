package List;

import List.Node.DupNode;

/**
 * 双向循环链表
 * @author jirafa
 */
public class DupLinkedList<T> {
    private int size;
    private DupNode<T> first;
    private DupNode<T> last;

    public DupLinkedList() {
        this.size=0;
        this.first =null;
        this.last =null;
    }

    /**
     * 头插法插入节点
     */
    public void  addFirst(T t){
        DupNode<T> node = new DupNode<>(t);
        if(size==0){
            first=last=node;
        }else {
            node.next=first;
            node.prior=last;
            first.prior=node;
            first=node;
            last.next=first;
        }
        size++;
    }

    /**
     * 尾插法插入
     * @param t
     */
    public void addLast(T t){
        DupNode<T> node = new DupNode<>(t);
        if(size==0){
            first=node;
            last=node;
        }else {
            last.next=node;
            node.prior=last;
            node.next=first;
            last=node;
        }
        size++;
    }

    public void add(T t,int index){
        DupNode<T> node = new DupNode<>(t);
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
        if(index<size/2){
            DupNode<T> pre = first;
            for (int i = 0; i < index-1; i++) {
                pre=pre.next;
            }
            node.next=pre.next;
            node.prior=pre;
            node.next.prior=node;
        }else {
            DupNode<T> aft=last;
            for (int i = size-1; i > index; i--) {
                aft=aft.prior;
            }
            aft.prior.next=node;
            node.prior=aft.prior;
            node.next=aft;
            aft.prior=node;
        }
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
        DupNode<T> cur;
        if(index<size/2){
            cur=first;
            for (int i = 0; i < index ; i++) {
                cur=cur.next;
            }
        }else {
            cur=last;
            for (int i = size-1; i > index; i--) {
                cur=cur.prior;
            }
        }
        cur.next.prior=cur.prior;
        cur.prior.next=cur.next;
        size--;
    }

    public void removeFirst(){
        first=first.next;
        first.prior=last;
        last.next=first;
        size--;
    }

    public void removeLast(){
        last=last.prior;
        last.next=first;
        first.prior=last;
        size--;
    }

    public void remove(T t){
        if(t.equals(first.t)){
            removeFirst();
        }else {
            DupNode<T> cur = first;
            int i;
            for (i = 0; i < size; i++) {
                if (cur.t.equals(t)) {
                    break;
                }
                cur = cur.next;
            }
            if (i == size) {
                throw new RuntimeException("未找到该元素");
            } else {
                if(cur.equals(last)){
                    removeLast();
                    return;
                }
                cur.prior.next=cur.next;
                cur.next.prior= cur.prior;
                size--;
            }
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
        DupNode<T> reNode=first;
        for (int i = 0; i < index; i++) {
            reNode=reNode.next;
        }
        return reNode.t;
    }

    public boolean contains(T t){
        DupNode<T> p=first;
        for (int i = 0; i < size; i++) {
            if(t.equals(p.t))
                return true;
            p=p.next;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    /**
     * 将传入循环链表list与本循环链表合并
     * @param list
     * @return void
     */
    public void connect(DupLinkedList<T> list){
        this.last.next=list.first;
        list.first.prior=list.last;
        list.last.next=this.first;
        this.first.prior=list.last;
        this.last= list.last;

        this.size+= list.size;
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        DupNode<T> p=first;
        for (int i = 0; i < size; i++) {
            list.append(p.t);
            p=p.next;
        }
        return "LinkedList{" +
               list+ '}';
    }
}
