package Lecture11;
import java.util.Stack;

public class Stk {
    public static void main(String[] args) {
        Stack<Integer> Stk = new Stack<>();
        //check empty
        System.out.println(Stk.empty());
        //add an element to the stack

        Stk.push(5);
        Stk.push(4);
        Stk.push(3);
        Stk.push(2);
        Stk.push(1);
        Stk.push(0);
        System.out.println(Stk);
        Stk.pop();
        Stk.pop();
        System.out.println(Stk);
        System.out.print(Stk.search(0));
    }   
}
