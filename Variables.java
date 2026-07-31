import java.util.Scanner;
public class Variables {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int score = scan.nextInt();
        scan.nextLine(); // Consume the newline character left by nextInt()
        String department = scan.nextLine();
        System.out.println("Name:" + name);
        System.out.println("Score:" + score);
        System.out.println("Department:" + department); 
    }
}