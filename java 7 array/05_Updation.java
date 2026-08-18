import java.util.Scanner;

public class Updation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to update (0 to " + (n - 1) + "): ");
        int pos = sc.nextInt();

        if (pos < 0 || pos >= n) {
            System.out.println("Invalid position");
            return;
        }

        System.out.print("Enter new value: ");
        int value = sc.nextInt();

        arr[pos] = value;

        System.out.println("Array after updation:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
