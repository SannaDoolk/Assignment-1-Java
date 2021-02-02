package Assignment1;

import java.util.Random;

public class Ants {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int [][] array2D = new int[8][8];
        array2D[0][0] = 0;
        
        int visitedSquares = 0;
        int steps = 0;

        while (visitedSquares < 64) {
            int x = rnd.nextInt(8);
            int y = rnd.nextInt(8);
            
            if (array2D[x][y] == 0) {
                array2D[x][y] = 1;
                visitedSquares++;
            }
            steps++;
        }

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D.length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(steps);

    }
}
