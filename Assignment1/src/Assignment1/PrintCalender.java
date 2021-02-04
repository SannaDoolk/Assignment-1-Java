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
        System.out.println("Mon\tTue\tWed\tThu\tFri\tSat\tSun"); 


        scan.close();    
    }

    public static String nameOfMonth(int month) {
        String[] months = new String[13];

        months[0] = ""; // Empty so that the month number will be the right index.
        months[1] = "January";
        months[2] = "February"; 
        months[3] = "March";
        months[4] = "April";
        months[5] = "May";
        months[6] = "June";
        months[7] = "July";
        months[8] = "August";
        months[9] = "September";
        months[10] = "October";
        months[11] = "November";
        months[12] = "December";

        return months[month];
    }

    public static int howManyDaysInMonth(int month, int year) {
        int daysInMonth = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            daysInMonth = 31;
            return daysInMonth;
        } else if (month == 4 || month == 6 || month == 10 || month == 11) {
            daysInMonth = 30;
            return daysInMonth;
        } else if (month == 2) {
            if (leapYear(year)) {
                daysInMonth = 29;
                return daysInMonth;
            } else {
            daysInMonth = 28;
            return daysInMonth;
            }
        } else {
            return 0;
        }
    }

    // If a year is divisble by 4 it's a leap year, unless it's divisble by 100, then it must also be divisble by 400 to be a leap year.
    public static boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                } 
            } else {
                return true;
            }  
        } else {
            return false;
        }
    }


    // How many days per year has passed since start of calender, add 365 or 366 days for every year.
    public static int daysPerYearSinceStart(int month, int year) {
        int totalDays = 0;
        int startYear = 1800;
        for (int i = startYear; i < year; i++) {
            if (leapYear(i)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        return passedDaysPerMonth(month, year, totalDays);
    }

    // Add the passed days for the month(s) before the entered month to the days that has passed for every full year in daysPerYearSinceStart method.
    public static int passedDaysPerMonth(int month, int year, int daysSinceStart) {
        for (int i = 1; i < month; i++) {
            daysSinceStart += howManyDaysInMonth(i, year);
        }
        return daysSinceStart;
    }
}
