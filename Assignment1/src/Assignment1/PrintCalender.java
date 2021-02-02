package Assignment1;

import java.util.Scanner;

public class PrintCalender {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year after 1800: ");
        int year = scan.nextInt();
        System.out.print("Enter a month (1-12): ");
        int month = scan.nextInt();
        System.out.println(nameOfMonth(month) + " " + year);
        System.out.println("-----------------------------");
    }

    public static String nameOfMonth(int month) {
        String[] months = new String[12];

        months[0] = "January";
        months[1] = "February"; 
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        return months[month - 1];
    }
}
