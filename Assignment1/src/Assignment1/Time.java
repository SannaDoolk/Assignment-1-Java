package Assignment1;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Give a number of seconds: ");
        int secondsInput = scan.nextInt();

        int hours = secondsInput / 60 / 60;
        int minutes = secondsInput / 60 - (hours * 60);
        int seconds = secondsInput % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");

        scan.close();
    }
}
