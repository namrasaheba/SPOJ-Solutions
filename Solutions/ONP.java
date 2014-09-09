/*
 * ======ACCEPTED=======
 */
package spoj.classical;

import java.util.*;
import java.lang.*;
/**
 *
 * @author Namra Saheba
 */
public class ONP {

    public static void main(String args[]) {

        Stack operatorStack = new Stack(); // Stack that will hold the operators
        Scanner scanner = new Scanner(System.in);        
        int testCases = Integer.parseInt(scanner.next()); // No. of test cases
        while (testCases > 0) {
            String input = scanner.next(); 
            char[] str = input.toCharArray();
            int length = str.length;
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < length; i++) {                
                if (Character.isLetter(str[i])) { // Append to the result if it is an alphabet
                    sb.append(str[i]);
                } else {
                    if (operatorStack.isEmpty() || str[i] == '(') { // If stack is empty or the input is '(' then push it on the operator stack
                        operatorStack.push(str[i]);
                    } else if (str[i] == ')') { // If the input char is ')' then pop and append the top of stack to the result until '(' is found
                        do {
                            sb.append(operatorStack.pop());
                        } while ('(' != operatorStack.peek().toString().charAt(0));
                        operatorStack.pop();
                    } else {
                        if (getPriority(str[i]) > getPriority(operatorStack.peek().toString().charAt(0))) { // If input char has more priority then push it to the stack
                            operatorStack.push(str[i]);
                        } else {
                            sb.append(operatorStack.pop()); // If input char has less priority then pop the stack and append it to the result and then push the input char to stack
                            operatorStack.push(str[i]);
                        }
                    }

                }
            }
            System.out.println(sb);
            testCases--;
        }

    }

    public static int getPriority(char c) {
        switch (c) {
            case '+':
                return 0;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 3;
            case '^':
                return 4;
            default:
                return -1;
        }
    }
}
