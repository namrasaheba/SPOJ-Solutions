/*
 * =====ACCEPTED=====
 * 10 September, 2014
 */
package spoj.classical;

import java.util.*;

/**
 * @author Namra Saheba
 */
public class ACPC10A {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String line[] = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(line[0]);
        int num2 = Integer.parseInt(line[1]);
        int num3 = Integer.parseInt(line[2]);
        
        while ( true ) {
            if ( (num1 == 0) && (num2 == 0) && (num3 == 0) ) {
                break;
            } else if ((2 * num2) == (num1 + num3)) {
                System.out.println("AP " + (num3 + (num2 - num1)));
            } else {
                System.out.println("GP " + (num3 * (num2 / num1)));
            }
            line = scanner.nextLine().split(" ");
            num1 = Integer.parseInt(line[0]);
            num2 = Integer.parseInt(line[1]);
            num3 = Integer.parseInt(line[2]);            
        }
    }
}
