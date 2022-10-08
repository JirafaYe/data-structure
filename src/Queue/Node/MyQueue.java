package Queue.Node;

import java.util.Stack;

public class MyQueue<T>  {
    Stack<T> stackIn;
    Stack<T> stackOut;
    public MyQueue() {
        stackIn =new Stack<>();
        stackOut =new Stack<>();
    }

    public void push(T x) {
        stackIn.push(x);
    }

    public T pop() {
        getOutput();
        return stackOut.pop();
    }

    public T peek() {
        getOutput();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty()&&stackOut.isEmpty();
    }

    public void getOutput(){
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
    }
}
