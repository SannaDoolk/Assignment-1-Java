package Assignment1;

import java.util.Random;
import java.util.Scanner;

public class GameSRP {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 

       String alternatives = "Scissor (" + 1 + "), rock (" + 2 + "), paper (" + 3 + ") or " + 0 + " to quit: ";
       System.out.println(alternatives);
       int playerChoice = scan.nextInt();
       int computerChoice;
       int playerScore = 0;
       int computerScore = 0;
       int draw = 0;
       Random randomChoice = new Random();

       while (playerChoice == 1 || playerChoice == 2 || playerChoice == 3) {
        computerChoice = randomChoice.nextInt(3 - 1 + 1) + 1;
        if (computerChoice == playerChoice) {
            System.out.println("It's a draw!");
            draw++;
            System.out.println(alternatives);
            playerChoice = scan.nextInt();
        } else if (computerChoice == 1 && playerChoice == 2) {
            System.out.println("You won, computer had rock");
            playerScore++;
            System.out.println(alternatives);
            playerChoice = scan.nextInt();
        } else if (computerChoice == 2 && playerChoice == 1) {
            System.out.println("You lost, computer had rock");
            computerScore++;
            System.out.println(alternatives);
            playerChoice = scan.nextInt();
        } else if (computerChoice == 3 && playerChoice == 1) {
            System.out.println("You won, computer had paper");
            playerScore++;
            System.out.println(alternatives);
            playerChoice = scan.nextInt();
        } else if (computerChoice == 3 && playerChoice == 2) {
            System.out.println("You lost, computer had paper");
            computerScore++;
            System.out.println(alternatives);
            playerChoice = scan.nextInt();
        } else if (playerChoice == 3 && computerChoice == 1) {
            System.out.println("You lost, computer had scissor");
            computerScore++;
            System.out.println(alternatives);
            playerChoice = scan.nextInt();
        } else if (playerChoice == 2 && computerChoice == 1) {
            System.out.println("You won, computer had scissor");
            playerScore++;
            System.out.println(alternatives);
            playerChoice = scan.nextInt();
            }
        }   
        
        if (playerChoice == 0) {
        System.out.println("Score: " + playerScore + " (you) " + computerScore + " (computer) " + draw + " (draw)");
        }  
        scan.close();    
    }    
}
