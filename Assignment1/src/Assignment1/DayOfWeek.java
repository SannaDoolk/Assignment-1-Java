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
        
        System.out.println(h % 7);

        scan.close();
    }
}
