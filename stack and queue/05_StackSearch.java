import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);
        System.out.println("Position of 30: " + stack.search(30));
        System.out.println("Position of 10: " + stack.search(10));
    }
}
