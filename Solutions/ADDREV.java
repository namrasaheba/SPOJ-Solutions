/*
 * =====ACCEPTED=====
 */
package spoj.classical;

import java.util.*;

/**
 *
 * @author Namra Saheba
 */
public class ADDREV {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.next());
        StringBuffer num1, num2, reverseResult;
        int reverseNum1, reverseNum2, result;
        while (testCases > 0) {
            num1 = new StringBuffer(scanner.next().replaceAll("^0+", ""));
            num2 = new StringBuffer(scanner.next().replaceAll("^0+", ""));

            reverseNum1 = Integer.parseInt(num1.reverse().toString());
            reverseNum2 = Integer.parseInt(num2.reverse().toString());
            
            result = reverseNum1 + reverseNum2;
            reverseResult = new StringBuffer(Integer.toString(result));
            
            System.out.println(reverseResult.reverse().toString().replaceAll("^0+", ""));
            testCases--;
        }

    }
}
