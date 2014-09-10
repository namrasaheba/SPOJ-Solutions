/*
 * =====ACCEPTED=====
 */
package spoj.classical;

import java.util.*;

/**
 *
 * @author Namra Saheba
 */
public class ABSYS {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.next());
        int number1, number2, result, indexOfPlus, indexOfEqual, indexOfMachula;
        while (testCases > 0) {
            String equation = scanner.nextLine();
            if (!equation.equals("")) {
                indexOfPlus = equation.indexOf('+');
                indexOfEqual = equation.indexOf('=');
                indexOfMachula = equation.indexOf("machula");
                if (indexOfMachula < indexOfPlus) {
                    number2 = Integer.parseInt(equation.substring(indexOfPlus + 2, indexOfEqual - 1));
                    result = Integer.parseInt(equation.substring(indexOfEqual + 2));
                    number1 = result - number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                } else if (indexOfMachula > indexOfPlus && indexOfMachula < indexOfEqual) {
                    number1 = Integer.parseInt(equation.substring(0, indexOfPlus - 1));
                    result = Integer.parseInt(equation.substring(indexOfEqual + 2));
                    number2 = result - number1;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                } else {
                    number1 = Integer.parseInt(equation.substring(0, indexOfPlus - 1));
                    number2 = Integer.parseInt(equation.substring(indexOfPlus + 2, indexOfEqual - 1));
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                }
                testCases--;
            }

        }
    }
}
