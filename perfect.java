package LOKESH;

import java.util.Scanner;

public class perfect {

    public static void main(String[] args) {
        int n, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

    
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

     
        if (n == sum) {
            System.out.println(" is a Perfect Number.");
        } else {
            System.out.println(" is Not a Perfect Number.");
        }

   
    }
}
