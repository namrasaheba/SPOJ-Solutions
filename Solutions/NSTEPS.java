/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spoj.classical;
import java.util.*;
/**
 *
 * @author Namra Saheba
 */
public class NSTEPS {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.next());
        int x, y;
        while ( testCases > 0 ) {
            x = Integer.parseInt(scanner.next());
            y = Integer.parseInt(scanner.next());
            if ( ((x == y) && (x % 2 == 0)) || ((x == y + 2) && (x % 2 == 0)) ) {
                System.out.println(x+y);
            } else if ( ((x == y) && (x % 2 != 0)) || ((x == y + 2) && (x % 2 != 0)) )  {
                System.out.println(x+y-1);
            } else {
                System.out.println("No Number");
            }
            testCases--;
        }
    }
}
