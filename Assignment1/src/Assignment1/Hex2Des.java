package Assignment1;

import java.util.Scanner;

public class Hex2Des {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String input = scan.nextLine();

        hexToDecimal(input);  
        
        scan.close();
    }

    public static double hexToDecimal(String str) {
        str = str.toUpperCase();
        int length = str.length();
        String characters = "0123456789ABCDEF"; // To convert letters into their value
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char strChar = str.charAt(i); // What character in "str" is currently i
            int character = characters.indexOf(strChar); // What index in "characters" has i
            double elevate = Math.pow(16, (length - 1)); 
            result += (character * elevate); 
            length--; 
        }
        System.out.println("The decimal value for " + str + " is " + result);
        
        return result;
    }
}
