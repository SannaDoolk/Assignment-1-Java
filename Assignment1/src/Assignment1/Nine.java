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

        int dice1;
        int dice2;

        int playerPoints = 0;
        int computerPoints = 0;

        if (answer.equals(Y)) {
            dice1 = rollDice();
            System.out.println("You rolled " + dice1);
            playerPoints += dice1;
            System.out.print("Do you want to roll again? Y/N ");
            answer = scan.nextLine();
            if (answer.equals(N)) {
                System.out.println("Your points are " + playerPoints);
            } else if (answer.equals(Y)) {
                dice2 = rollDice();
                System.out.println("You rolled " + dice2 + " and your total is " + (playerPoints + dice2));
                playerPoints += dice2;    
            }
        } else {
            System.out.println("Maybe some other time");
        }
        
        dice1 = rollDice();
        System.out.println("The computer rolled " + dice1);
        computerPoints += dice1;
        if (computerPoints <= 4) {
            dice2 = rollDice();
            System.out.println("The computer rolled again and gets " + dice2 + " and total is " + (computerPoints += dice2));
        } else {
            System.out.println("The computer rolled " + dice1);
        }

        if (computerPoints > playerPoints && computerPoints <= 9) {
            System.out.println("The computer wins");
        } else if (playerPoints > computerPoints && playerPoints <= 9) {
            System.out.println("You won");
        } else if (computerPoints >= 10) {
            System.out.println("You won");
        } else if (playerPoints >= 10) {
            System.out.println("The computer wins");
        } else if (computerPoints >= 10 && playerPoints >= 10) {
            System.out.println("The computer wins");
        } else {
            System.out.println("It's a tie!");
        }

        scan.close();
    }
    public static int rollDice() {
        Random randomNum = new Random();
        int roll = randomNum.nextInt(6 - 1 + 1) + 1;
        return roll;
    }
}
