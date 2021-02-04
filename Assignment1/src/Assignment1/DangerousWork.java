package Assignment1;

import java.util.Scanner;

public class DangerousWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How much money do you want to earn?");

        int moneyToEarn = scan.nextInt();
        int daysToWork = 0;

        for (double i = 0.01; i <= moneyToEarn; i += i) {
           daysToWork++;
        }
        System.out.println("You will have your money in " + daysToWork + " days");
        
        scan.close();
    }
}
