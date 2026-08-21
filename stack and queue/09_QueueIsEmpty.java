import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        System.out.println("Is Queue Empty? " + queue.isEmpty());
        queue.add(10);
        queue.add(20);
        System.out.println("Is Queue Empty? " + queue.isEmpty());

        queue.remove();
        queue.remove();
        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }
}
