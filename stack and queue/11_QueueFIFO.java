import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Elements removed in FIFO order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
