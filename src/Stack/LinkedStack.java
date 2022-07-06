package Stack;

import Stack.Node.StackNode;

public class LinkedStack<T> {
    private StackNode<T> first;
    private int length;

    public LinkedStack(StackNode<T> node) {
        this.first = node;
    }

    public LinkedStack() {
        this.first=null;
        this.length =0;
    }

    public void clear(){
        first=null;
        length =0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int length(){
        return length;
    }

    public void push(T t){
        StackNode<T> newNode = new StackNode<>(t);
        newNode.next=first;
        first=newNode;
        length++;
    }

    public T peek() throws Exception {
        if(first==null)
            throw new Exception("空栈");
        return first.t;
    }

    public T pop() throws Exception {
        if(first==null)
            throw new Exception("空栈");
        T t= first.t;
        first=first.next;
        length--;
        return t;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        StackNode<T> node=first;
        while (node!=null){
            builder.append(node.t);
            node=node.next;
        }
        return "LinkedStack{"+
                builder
                +"}";
    }
}
