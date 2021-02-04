package Assignment1;

import java.util.Random;

public class Ants {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result += numOfSteps();
        }
        int average = (result / 10);
        System.out.println("Average steps is: " + average);   
    }

    public static int numOfSteps() {

        Random rnd = new Random();
        int [][] array2D = new int[8][8];
        array2D[0][0] = 0;
        
        int visitedSquares = 0;
        int steps = 0;

        int x = rnd.nextInt(8);
        int y = rnd.nextInt(8);

        while (visitedSquares < 64) {

            if (array2D[x][y] == 0) {
                array2D[x][y] += 1;
                visitedSquares++;
            }   

            int rndDir = randomDirection();

            if (rndDir == 0) {
                y--;
                if (y < 0) {
                y++;
                }
            } else if (rndDir == 1) {
                y++;
                if (y > 7) {
                    y--; 
            }
            } else if (rndDir == 2) {
                    x--;
                if (x < 0) {
                    x++;
                } 
            } else if (rndDir == 3) {
                   x++;
                if (x > 7) {
                   x--;
                } 
            }

            steps++;
        }
        System.out.println("Number of steps in simulation: " + steps);
        return steps;
        }

        public static int randomDirection() {
            Random rnd = new Random();
            int z = rnd.nextInt(4);
            return z;
        }
}
