package Assignment1;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h;
        int q;
        int m;
        int k;
        int j;

        System.out.println("Enter a year: ");
        int year = scan.nextInt();

        System.out.println("Enter a month (1-12): ");
        m = scan.nextInt();

        System.out.println("Enter day of the month (1-31): ");
        q = scan.nextInt();

        if (m == 1) {
            m = 13;
            year -= 1;
        } else if (m == 2) {
            m = 14;
            year -=1;
        }

        k = (year % 100);
        j = (year / 100);
   
        h = q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j);

        h = h % 7;

        String[] weekDay = new String[7];
        weekDay[0] = "Saturday";
        weekDay[1] = "Sunday";
        weekDay[2] = "Monday";
        weekDay[3] = "Tuesday";
        weekDay[4] = "Wednesday";
        weekDay[5] = "Thursday";
        weekDay[6] = "Friday";

        System.out.println("Day of week is " + weekDay[h]);

        scan.close();
    }
}
