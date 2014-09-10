/*
 * =====ACCEPTED=====
 */
package spoj.classical;

import java.util.*;

/**
 * The algorithm and understanding has been taken from the following link
 * http://jiteshsunhala.blogspot.in/2013/08/spoj-problem-4300-ae00.html
 *
 * @author Namra Saheba
 */
public class AE00 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int noOfSquares = 0, noOfRectangles = 0;
        // Counting number of Rectangles
        for (int i = 1; i <= Math.floor(Math.sqrt(n)); i++) {
            for (int j = i + 1; i * j <= n; j++) {
                noOfRectangles++;
            }
        }

        // Counting number of Squares
        noOfSquares = (int) Math.floor(Math.sqrt(n));
        System.out.println((noOfSquares + noOfRectangles));
    }
}
