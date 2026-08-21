import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("1");

        for (int i = 1; i <= 5; i++) {
            String current = queue.remove();
            System.out.println(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}
