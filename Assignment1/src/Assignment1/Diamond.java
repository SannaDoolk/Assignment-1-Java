package Assignment1;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scan.nextInt();
        String star = "*";
        int space = number - 1;

        for (int i = 1; i <= number; i++) {
            for(int j = 1; j < space; j++) {
                System.out.print("1");
            }
            space--;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
