package Assignment1;

import java.util.Scanner;

public class PrintCalender {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year after 1800: ");
        int year = scan.nextInt();
        System.out.print("Enter a month (1-12): ");
        int month = scan.nextInt();
        month = month - 1;
        System.out.println(nameOfMonth(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println("Mon\tTue\tWed\tThu1\tFri\tSat\tSun");

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

        return months[month];
    }

    public static int howManyDaysInMonth(int month) {
        int daysInMonth = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 11) {
            daysInMonth = 31;
            return daysInMonth;
        } else if (month == 4 || month == 6 || month == 10 || month == 11) {
            daysInMonth = 30;
            return daysInMonth;
        } else if (month == 2) {
            daysInMonth = 28;
            return daysInMonth;
        } else {
            return 0;
        }
    }
}
