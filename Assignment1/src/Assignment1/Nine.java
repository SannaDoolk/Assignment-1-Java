package Assignment1;

import java.util.Random;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Are you ready to play? (Y/N) ");

        String answer = scan.nextLine();
        String Y = "Y";
        String N = "N";

        Random randomNum = new Random();
        int dice1 = randomNum.nextInt(6 - 1 + 1) + 1;
        int dice2 = randomNum.nextInt(6 - 1 + 1) + 1;

        int playerPoints = 0;
        int computerPoints = 0;

        if (answer.equals(Y)) {
            System.out.println("You rolled " + dice1);
            playerPoints += dice1;
            System.out.print("Do you want to roll again? Y/N ");
            answer = scan.nextLine();
            if (answer.equals(N)) {
                System.out.println("Your points are " + playerPoints);
            } else if (answer.equals(Y)) {
                System.out.println("You rolled " + dice2 + " and your total is " + (playerPoints + dice2));
                playerPoints += dice2;    
            }
        } else {
            System.out.println("Maybe some other time");
        }

        System.out.println("Computer rolled " + dice1);
        computerPoints += dice1;
        if (computerPoints <= 4) {
            System.out.println("The computer rolled again and gets " + dice2 + " and total is " + (computerPoints += dice2));
        } else {
            System.out.println("The computer rolled " + dice1);
        }

        if (computerPoints > playerPoints && computerPoints <= 9) {
            System.out.println("Computer wins");
        } else if (playerPoints > computerPoints && playerPoints <= 9) {
            System.out.println("You win");
        } else if (computerPoints >= 10) {
            System.out.println("You win");
        } else if (playerPoints >= 10) {
            System.out.println("Computer wins");
        } else if (computerPoints >= 10 && playerPoints >= 10) {
            System.out.println("Computer wins");
        } else {
            System.out.println("It's a tie!");
        }

        scan.close();
    }
}
