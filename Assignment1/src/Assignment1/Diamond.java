package Assignment1;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                System.out.println(" ");
            }
            
        }
    }
}
