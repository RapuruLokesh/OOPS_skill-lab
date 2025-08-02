package LOKESH;
import java.util.Scanner;

public class sumofsquares {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int sum = 0;
       
        for (int i = 1; i <= n; i++) {
            sum += i * i;  // square of i
        }

        System.out.println("Sum of squares from 1 to " + n + " is: " + sum);

        scanner.close();
    }
        
}
