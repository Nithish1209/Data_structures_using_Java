import java.util.Stack;

public class Stack{
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        // Printing the elements of the stack
        System.out.println("Elements in the stack: " + stack);

        // Peeking at the top element without removing it
    }
}