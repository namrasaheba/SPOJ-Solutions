/*
 * =====ACCEPTED=====
 */
package spoj.classical;
import java.util.*;
/**
 * The algorithm/ formula is derived from this link http://math.ucsd.edu/~wgarner/personal/puzzles/num_square_chess_sol.htm
 * @author Namra Saheba
 */
public class SAMER08F {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        while ( n != 0 ) {
            int result = (n * (n + 1) * (2*n + 1)) / 6;
            System.out.println(result);
            n = Integer.parseInt(scanner.next());
        }
    }
}
