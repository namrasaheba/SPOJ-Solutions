/*
 * ======ACCEPTED======
 */
package spoj.classical;
import java.util.*;
/**
 *
 * @author Namra Saheba
 */
public class FCTRL {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.next());
        while ( testCases > 0 ) {
            int number = Integer.parseInt(scanner.next());
            int count = 0;
            int multipleOf5 = 5;
            while ( multipleOf5 <= number ) {
                count += number/multipleOf5;                
                multipleOf5 *= 5;
            }
            System.out.println(count);
            testCases--;
        }
    }
}
