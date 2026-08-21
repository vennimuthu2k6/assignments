import java.util.*;

class Main {
    public static void main(String[] args) {
        String str = "JAVA";
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        System.out.println("Original String: " + str);
        System.out.print("Reversed String: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
