/*
 * =====ACCEPTED===== 
 */
package spoj.classical;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author Namra Saheba
 */
public class FCTRL2 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.next());
        while (testCases > 0) {
            int n = Integer.parseInt(scanner.next());
            BigInteger result = BigInteger.valueOf(1);
            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(result);
            testCases--;
        }

    }
}
