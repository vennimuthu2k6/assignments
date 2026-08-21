import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("Is Stack Empty? " + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        System.out.println("Is Stack Empty? " + stack.isEmpty());

        stack.pop();
        stack.pop();
        System.out.println("Is Stack Empty? " + stack.isEmpty());
    }
}
