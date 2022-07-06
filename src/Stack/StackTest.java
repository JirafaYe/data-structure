package Stack;

import List.Entity.Polinomial;

public class StackTest {
    public static void main(String[] args) throws Exception {
        SqStack<Polinomial> stack = new SqStack<>();
        System.out.println("empty : "+stack.isEmpty());
        for (int i = 0; i < 10; i++) {
            stack.push(new Polinomial(i,i));
        }
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        if(stack.length()!=0)
            stack.clear();
        System.out.println(stack);
    }
}
