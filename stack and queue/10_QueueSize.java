import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        queue.add(500);

        System.out.println("Queue: " + queue);
        System.out.println("Queue Size: " + queue.size());
    }
}
