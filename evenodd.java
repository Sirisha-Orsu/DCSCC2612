import java.util.Scanner; 

public class EvenOdd {
    public static void main(String[] args) {
        // Create a Scanner object to read console input
        Scanner scanner = new Scanner(System.out.println);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Use the modulo operator (%) to check the remainder
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        
        scanner.close(); // Best practice to prevent resource leaks
    }
}