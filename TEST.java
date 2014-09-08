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
public class TEST {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.next());
        while ( input != 42 ) {
            System.out.println(input);
            input = Integer.parseInt(scanner.next());
        }
    }
}
