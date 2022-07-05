package 栈;

import java.util.Arrays;

public class SqStack<T> {
    private Object[] elem;
    private int top;

    public SqStack() {
        this.top=0;
        this.elem=new Object[100];
    }

    public SqStack(int size) {
        this.elem = new Object[size];
        this.top=0;
    }

    public void clear(){
        this.top=0;
    }

    public boolean isEmpty(){
        return top==0;
    }

    public int length(){
        return this.top;
    }

    /**
     *  读取栈顶元素
     */
    public T peek() throws Exception {
        if(top==0)
            throw new Exception("空栈");
        else
            return (T) elem[top-1];
    }

    public void push(T t){
        if(top==elem.length)
            throw new RuntimeException("栈已满");
        else{
            elem[top++]=t;
        }
    }

    public T pop() throws Exception {
        if(top==0)
            throw new Exception("空栈");
        else
            return (T) elem[--top];
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < this.top; i++) {
            string.append(elem[i]);
        }
        return "SqStack{" +
                 string +
                '}';
    }
}
