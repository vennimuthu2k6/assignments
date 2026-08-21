import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue after peek: " + queue);
    }
}
