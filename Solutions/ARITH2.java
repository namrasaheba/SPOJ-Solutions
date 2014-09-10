/*
 * =====ACCEPTED=====
 */
package spoj.classical;

import java.util.*;

/**
 *
 * @author Namra Saheba
 */
public class ARITH2 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.next());        
        long result = 0;
        while (testCases > 0) {
            String input = scanner.nextLine();
            if (!input.equals("")) {
                Stack stack = new Stack();
                
                input = input.trim().replaceAll(" +", " ");
                input = input.substring(0, input.indexOf('='));                
                String inputArray[] = input.split(" ");                
                
                int length = inputArray.length;
                int i = 0;
                char operator = '+';
                while (i < length) {
                    if (Character.isDigit(inputArray[i].charAt(0))) {
                        if (stack.isEmpty()) {
                            stack.push(inputArray[i]);                
                        } else if (stack.size() == 1) {
                            stack.push(inputArray[i]);                
                            result = performCalculation(Long.parseLong(stack.pop().toString()), operator, Long.parseLong(stack.pop().toString()));
                            stack.push(result);
                        }
                    } else {
                        operator = inputArray[i].charAt(0);
                    }
                    i++;
                }
                System.out.println(result);
                testCases--;
            }
        }
    }

    public static long performCalculation(long number1, char operator, long number2) {         
        switch (operator) {
            case '+':
                return number2 + number1;
            case '-':
                return number2 - number1;
            case '*':
                return number2 * number1;
            case '/':                
                return number2 / number1;
            default:
                return 0;
        }
    }
}
