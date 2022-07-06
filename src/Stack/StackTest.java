package Stack;

import List.Entity.Polinomial;

public class StackTest {
    public static void main(String[] args) throws Exception {
        LinkedStack<Polinomial> stack = new LinkedStack<>();
        System.out.println("empty : "+stack.isEmpty());
        for (int i = 0; i < 10; i++) {
            stack.push(new Polinomial(i,i));
        }
        System.out.println(stack);
        System.out.println("peek:"+stack.peek());
        stack.push(new Polinomial(10,10));
        System.out.println("pop:"+stack.pop());
        System.out.println(stack);
        if(stack.length()!=0)
            stack.clear();
        System.out.println(stack);
    }

    private void testSqStack() throws Exception {
        SqStack<Polinomial> stack = new SqStack<>();
        System.out.println("empty : "+stack.isEmpty());
        for (int i = 0; i < 10; i++) {
            stack.push(new Polinomial(i,i));
        }
        System.out.println(stack);
        System.out.println("peek:"+stack.peek());
        System.out.println("pop:"+stack.pop());
        System.out.println(stack);
        if(stack.length()!=0)
            stack.clear();
        System.out.println(stack);
    }
}
