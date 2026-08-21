import java.util.*;

class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("HTML");

        System.out.println("Stack: " + stack);
        System.out.println("Size: " + stack.size());
    }
}
